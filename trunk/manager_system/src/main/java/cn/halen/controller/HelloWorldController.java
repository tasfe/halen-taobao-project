package cn.halen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping(value="/admin/hello")
	public String sayHello(Model model) {
		model.addAttribute("user", "world");
		return "admin/hello";
	}
}
