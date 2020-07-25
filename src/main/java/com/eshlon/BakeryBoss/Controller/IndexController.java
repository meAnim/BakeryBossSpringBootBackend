package com.eshlon.BakeryBoss.Controller;

import java.util.Arrays;
import java.util.HashSet;

import javax.persistence.metamodel.SetAttribute;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.eshlon.BakeryBoss.Model.Role;
import com.eshlon.BakeryBoss.Model.User;
import com.eshlon.BakeryBoss.Repo.RoleRepository;
import com.eshlon.BakeryBoss.Repo.UserRepository;

@Controller
public class IndexController {
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	RoleRepository roleRepo;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@RequestMapping("/")
	public String home() {
		return "views/index.jsp";
	}
	
	@RequestMapping("/register")
	public String signup() {	
		return "views/signup.jsp";
	}
	
//	Format 2
	@RequestMapping("/signUpuser")
	public String signUpuser(@ModelAttribute("user") User user){ 
		if(user.getPassword() != null && user.getPassword() != "" && user.getPassword().equals(user.getvPassword())) {
			
			user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
			user.setStatus("VERIFIED");
			
			Role userRole = roleRepo.findByRole("SITE_USER");
			user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
			
			userRepo.save(user);
			return "views/signupSuccess.jsp";
		}else {
			return "/register?errorMessage=Error in inputs please make sure you have entered the correct information";
		}
		
	}
	
}