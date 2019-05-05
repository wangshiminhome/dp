package net.chenlin.dp.modules.fun.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.common.utils.CommonUtils;
import net.chenlin.dp.modules.fun.entity.FunPersonEntity;
import net.chenlin.dp.modules.fun.dao.FunPersonMapper;
import net.chenlin.dp.modules.fun.service.FunPersonService;

/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
@Service("funPersonService")
public class FunPersonServiceImpl implements FunPersonService {

	@Autowired
    private FunPersonMapper funPersonMapper;

    /**
     * 分页查询
     * @param params
     * @return
     */
	@Override
	public Page<FunPersonEntity> listFunPerson(Map<String, Object> params) {
		Query query = new Query(params);
		Page<FunPersonEntity> page = new Page<>(query);
		funPersonMapper.listForPage(page, query);
		return page;
	}

    /**
     * 新增
     * @param funPerson
     * @return
     */
	@Override
	public R saveFunPerson(FunPersonEntity funPerson) {
		int count = funPersonMapper.save(funPerson);
		return CommonUtils.msg(count);
	}

    /**
     * 根据id查询
     * @param id
     * @return
     */
	@Override
	public R getFunPersonById(Long id) {
		FunPersonEntity funPerson = funPersonMapper.getObjectById(id);
		return CommonUtils.msg(funPerson);
	}

    /**
     * 修改
     * @param funPerson
     * @return
     */
	@Override
	public R updateFunPerson(FunPersonEntity funPerson) {
		int count = funPersonMapper.update(funPerson);
		return CommonUtils.msg(count);
	}

    /**
     * 删除
     * @param id
     * @return
     */
	@Override
	public R batchRemove(Long[] id) {
		int count = funPersonMapper.batchRemove(id);
		return CommonUtils.msg(id, count);
	}

}
