package com.blackbriar.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.blackbriar.service.FlowerDemoService;
import com.opensymphony.xwork2.ActionSupport;


@SuppressWarnings("serial")
@Namespace("/")
@ParentPackage("struts-default")
@Result(name="success",location = "/login.jsp")//全局Result,找不到action私有的result才回来找这个
public class FlowerDemoAction extends ActionSupport{
	
	
	@Autowired
	private FlowerDemoService flowerDemoService;
	
	@Action(value="addDemo",results={
			@Result(name="success",location="/login.jsp"),
			@Result(name="error",location="/error500.jsp")	
	})
	public String addDemo(){
//		System.out.println(flowerDemoService);
//		 Flower flower = new Flower();
//		 flower.setFlowername("测试花名");
//		 if(flowerDemoService.addFlower(flower))  return SUCCESS;
//		 else 
			 return ERROR;
	}
	
	public String execute2(){
		System.out.println(flowerDemoService);
		return "success";
	}
	public String execute(){
		System.out.println(flowerDemoService);
		return "success";
	}

	public FlowerDemoService getFlowerDemoService() {
		return flowerDemoService;
	}

	public void setFlowerDemoService(FlowerDemoService flowerDemoService) {
		this.flowerDemoService = flowerDemoService;
	}


	
}
