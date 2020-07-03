package com.eshlon.BakeryBoss.Controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value = "/login",  method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String loginPage() {	
		return "views/login.jsp";
	}
	
}
