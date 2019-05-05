package net.chenlin.dp.modules.fun.service.impl;

import java.util.Date;
import java.util.Map;

import net.chenlin.dp.common.utils.DateUtils;
import net.chenlin.dp.common.utils.ShiroUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.common.utils.CommonUtils;
import net.chenlin.dp.modules.fun.entity.FunGroupEntity;
import net.chenlin.dp.modules.fun.dao.FunGroupMapper;
import net.chenlin.dp.modules.fun.service.FunGroupService;

/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
@Service("funGroupService")
public class FunGroupServiceImpl implements FunGroupService {

	@Autowired
    private FunGroupMapper funGroupMapper;

    /**
     * 分页查询
     * @param params
     * @return
     */
	@Override
	public Page<FunGroupEntity> listFunGroup(Map<String, Object> params) {
		Query query = new Query(params);
		Page<FunGroupEntity> page = new Page<>(query);
		funGroupMapper.listForPage(page, query);
		return page;
	}

    /**
     * 新增
     * @param funGroup
     * @return
     */
	@Override
	public R saveFunGroup(FunGroupEntity funGroup) {
		funGroup.setAddTime(new Date());
		funGroup.setGroupState("1");
		funGroup.setUserId(ShiroUtils.getUserId());
		int count = funGroupMapper.save(funGroup);
		return CommonUtils.msg(count);
	}

    /**
     * 根据id查询
     * @param id
     * @return
     */
	@Override
	public R getFunGroupById(Long id) {
		FunGroupEntity funGroup = funGroupMapper.getObjectById(id);
		return CommonUtils.msg(funGroup);
	}

    /**
     * 修改
     * @param funGroup
     * @return
     */
	@Override
	public R updateFunGroup(FunGroupEntity funGroup) {
		int count = funGroupMapper.update(funGroup);
		return CommonUtils.msg(count);
	}

    /**
     * 删除
     * @param id
     * @return
     */
	@Override
	public R batchRemove(Long[] id) {
		int count = funGroupMapper.batchRemove(id);
		return CommonUtils.msg(id, count);
	}

}
