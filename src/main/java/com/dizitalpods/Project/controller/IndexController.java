package com.dizitalpods.Project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController 
{
	@RequestMapping("/")
	public String index() {
		return"index";
	}
	@RequestMapping("/display")
	   public String display()
	   {
		   return "display";
	  }
	   @RequestMapping("/insert")
	   public String insert()
	   {
		   return "insert";
	  }
	   @RequestMapping("/update")
	   public String update()
	   {
		   return "update";
	  }
	   
	   @RequestMapping("/delete")
	   public String delete()
	   {
		   return "delete";
	  }

}
