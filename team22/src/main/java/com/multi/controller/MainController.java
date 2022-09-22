package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping({"/"})
	public String main() {
		return "main";
	}
	
	@RequestMapping({"/login"})
	public String login(Model model) {
		model.addAttribute("center", "login");
		return "main";
	}
	
	@RequestMapping({"/register"})
	public String register(Model model) {
		model.addAttribute("center", "register");
		return "main";
	}
	

	@RequestMapping({"/loginimpl"})
	public String loginimpl(String id, String pwd, Model model) {

//		if (id.equals("qqqq") && pwd.equals("1111")) {
//			model.addAttribute("center", "loginok");
//			model.addAttribute("loginid", id);
//		} else {
//			model.addAttribute("center", "loginfail");
//		}

		return "main";
	}
}