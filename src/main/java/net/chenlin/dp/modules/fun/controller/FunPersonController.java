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
import net.chenlin.dp.modules.fun.entity.FunPersonEntity;
import net.chenlin.dp.modules.fun.service.FunPersonService;

/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
@RestController
@RequestMapping("/fun/person")
public class FunPersonController extends AbstractController {
	
	@Autowired
	private FunPersonService funPersonService;
	
	/**
	 * 列表
	 * @param params
	 * @return
	 */
	@RequestMapping("/list")
	public Page<FunPersonEntity> list(@RequestBody Map<String, Object> params) {
		return funPersonService.listFunPerson(params);
	}
		
	/**
	 * 新增
	 * @param funPerson
	 * @return
	 */
	@SysLog("新增")
	@RequestMapping("/save")
	public R save(@RequestBody FunPersonEntity funPerson) {
		return funPersonService.saveFunPerson(funPerson);
	}
	
	/**
	 * 根据id查询详情
	 * @param id
	 * @return
	 */
	@RequestMapping("/info")
	public R getById(@RequestBody Long id) {
		return funPersonService.getFunPersonById(id);
	}
	
	/**
	 * 修改
	 * @param funPerson
	 * @return
	 */
	@SysLog("修改")
	@RequestMapping("/update")
	public R update(@RequestBody FunPersonEntity funPerson) {
		return funPersonService.updateFunPerson(funPerson);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@SysLog("删除")
	@RequestMapping("/remove")
	public R batchRemove(@RequestBody Long[] id) {
		return funPersonService.batchRemove(id);
	}
	
}
