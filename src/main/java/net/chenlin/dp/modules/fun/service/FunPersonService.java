package net.chenlin.dp.modules.fun.service;

import java.util.Map;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.fun.entity.FunPersonEntity;

/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
public interface FunPersonService {

    /**
     * 分页查询
     * @param params
     * @return
     */
	Page<FunPersonEntity> listFunPerson(Map<String, Object> params);

    /**
     * 新增
     * @param funPerson
     * @return
     */
	R saveFunPerson(FunPersonEntity funPerson);

    /**
     * 根据id查询
     * @param id
     * @return
     */
	R getFunPersonById(Long id);

    /**
     * 修改
     * @param funPerson
     * @return
     */
	R updateFunPerson(FunPersonEntity funPerson);

    /**
     * 删除
     * @param id
     * @return
     */
	R batchRemove(Long[] id);
	
}
