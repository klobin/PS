package com.parkingsystem.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("parking-system")
public class UIKontroller {
	@RequestMapping(value ="myPage")
	public void showMyUIPage(Model model){
		//		model.addAttribute(arg0)
	}
}
