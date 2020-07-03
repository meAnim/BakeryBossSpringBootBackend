package com.eshlon.BakeryBoss.Controller;

import java.util.Arrays;
import java.util.HashSet;

import javax.persistence.metamodel.SetAttribute;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(value = "/")
	public String home() {
		return "index.jsp";
	}
	
	
//	sign up a user
	@RequestMapping(value = "/signUpuser" , method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> signUpuser(@ModelAttribute("user") User user){ 
		try {
			if(user.getPassword() != null && user.getPassword() != "" && user.getPassword().equals(user.getvPassword())) {
				
				user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
				user.setStatus("VERIFIED");
				
				Role userRole = roleRepo.findByRole("SITE_USER");
				user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
				
				userRepo.save(user);
				return new ResponseEntity<Void>(HttpStatus.CREATED);
			}else {
				return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
			}
			
		} catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
		}	
	}	
}