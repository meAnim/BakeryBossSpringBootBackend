package com.eshlon.BakeryBoss.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainDashboardController {
	
	@RequestMapping("/dashboard.user")
	public String home() {
		return "views/dashboard.jsp";
	}
}
