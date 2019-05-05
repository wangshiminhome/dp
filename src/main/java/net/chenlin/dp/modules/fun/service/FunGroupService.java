package net.chenlin.dp.modules.fun.service;

import java.util.Map;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.fun.entity.FunGroupEntity;

/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
public interface FunGroupService {

    /**
     * 分页查询
     * @param params
     * @return
     */
	Page<FunGroupEntity> listFunGroup(Map<String, Object> params);

    /**
     * 新增
     * @param funGroup
     * @return
     */
	R saveFunGroup(FunGroupEntity funGroup);

    /**
     * 根据id查询
     * @param id
     * @return
     */
	R getFunGroupById(Long id);

    /**
     * 修改
     * @param funGroup
     * @return
     */
	R updateFunGroup(FunGroupEntity funGroup);

    /**
     * 删除
     * @param id
     * @return
     */
	R batchRemove(Long[] id);
	
}
