package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/mypage"})
public class MPController {
	@RequestMapping({""})
	public String mypage1(Model model) {
		model.addAttribute("center", "mypage/mypage_center");
		model.addAttribute("left", "mypage/mypage_left");
		return "main";
	}

	@RequestMapping({"/mypage"})
	public String mypage(Model model) {
		model.addAttribute("left", "mypage/mypage_left");
		model.addAttribute("center", "mypage/mypage");
		return "main";
	}

}

