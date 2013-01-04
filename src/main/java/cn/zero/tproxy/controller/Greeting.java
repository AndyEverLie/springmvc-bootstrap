package cn.zero.tproxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/greeting.htm")
public class Greeting {

	@RequestMapping(method = RequestMethod.GET)
	public String baseSetting(Model model) {
		model.addAttribute("greeting", "this is spring mvc demo.");
		
		return "greeting";
	}
}
