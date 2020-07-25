package com.eshlon.BakeryBoss.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JwtAuthenticationController {
	@RequestMapping("/jwtAuthentication")
	public String home() {
		return "views/signupSuccess.jsp";
	}
}
