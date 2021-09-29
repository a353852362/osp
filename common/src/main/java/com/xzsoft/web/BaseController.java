package com.xzsoft.web;

import com.xzsoft.entity.system.SysUser;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Controller基类
 * Created by wangfan on 2017-06-10 10:10
 */
public class BaseController {

	private static final String TAG = "BaseController";

	/**
	 * 获取当前登录的user
	 */
	public SysUser getLoginUser() {
		try {
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			if (authentication == null) return null;
			Object object = authentication.getPrincipal();
			if (object != null) return (SysUser) object;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	/**
	 * 获取当前登录的userId
	 */
	public String getLoginUserId() {
		SysUser loginUser = getLoginUser();
		return loginUser == null ? null : loginUser.getSid();
	}

}
