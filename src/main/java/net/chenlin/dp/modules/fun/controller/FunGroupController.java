package net.chenlin.dp.modules.fun.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.chenlin.dp.common.annotation.SysLog;
import net.chenlin.dp.modules.sys.controller.AbstractController;
import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.fun.entity.FunGroupEntity;
import net.chenlin.dp.modules.fun.service.FunGroupService;

/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
@RestController
@RequestMapping("/fun/group")
public class FunGroupController extends AbstractController {
	
	@Autowired
	private FunGroupService funGroupService;
	
	/**
	 * 列表
	 * @param params
	 * @return
	 */
	@RequestMapping("/list")
	public Page<FunGroupEntity> list(@RequestBody Map<String, Object> params) {
		return funGroupService.listFunGroup(params);
	}
		
	/**
	 * 新增
	 * @param funGroup
	 * @return
	 */
	@SysLog("新增")
	@RequestMapping("/save")
	public R save(@RequestBody FunGroupEntity funGroup) {
		return funGroupService.saveFunGroup(funGroup);
	}
	
	/**
	 * 根据id查询详情
	 * @param id
	 * @return
	 */
	@RequestMapping("/info")
	public R getById(@RequestBody Long id) {
		return funGroupService.getFunGroupById(id);
	}
	
	/**
	 * 修改
	 * @param funGroup
	 * @return
	 */
	@SysLog("修改")
	@RequestMapping("/update")
	public R update(@RequestBody FunGroupEntity funGroup) {
		return funGroupService.updateFunGroup(funGroup);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@SysLog("删除")
	@RequestMapping("/remove")
	public R batchRemove(@RequestBody Long[] id) {
		return funGroupService.batchRemove(id);
	}
	
}
