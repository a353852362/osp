package com.xzsoft.system.controller;


import com.xzsoft.system.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.xzsoft.system.service.SysUserService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xboV
 * @since 2021-09-27
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {

	@Autowired
	private SysUserService sysUserService;

	@GetMapping("helloworld")
	public SysUser listUser(){
		return null;
	}

}
