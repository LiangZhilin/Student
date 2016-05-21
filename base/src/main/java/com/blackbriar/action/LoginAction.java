package com.blackbriar.action;

import java.io.IOException;
import java.io.PrintWriter;

import net.sf.json.JSONArray;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.blackbriar.model.User;
import com.blackbriar.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Namespace("/")
@ParentPackage("struts-default")
public class LoginAction extends BaseAction{
	@Autowired
	private UserService userService;
	private User user;
	@Action(value="login")
	public void login() {
		System.out.println(user);
		PrintWriter writer = null;
		try {
			writer = response.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
        if(userService.matching(user)){
        	writer.write("success");
        }
        else
        writer.write("error");
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
