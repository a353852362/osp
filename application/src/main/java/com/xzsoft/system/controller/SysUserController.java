package com.xzsoft.system.controller;


import com.xzsoft.entity.system.SysUser;
import com.xzsoft.web.PageParam;
import com.xzsoft.web.PageResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.xzsoft.system.service.SysUserService;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xboV
 * @since 2021-09-27
 */
@Api(tags = "用户管理")
@RestController
@RequestMapping("/platform/application/dict/user")
public class SysUserController {

	@Autowired
	private SysUserService sysUserService;

	@ApiOperation("分页查询用户")
	@GetMapping("/page")
	public PageResult<SysUser> page(HttpServletRequest request) {
		PageParam<SysUser> pageParam = new PageParam<>(request);
		pageParam.setDefaultOrder(null, new String[]{"create_time"});
//		sysUserService.listPage(pageParam), pageParam.getTotal();
		return new PageResult<>();
	}

}
