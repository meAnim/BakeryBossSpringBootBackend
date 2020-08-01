package com.eshlon.BakeryBoss.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.eshlon.BakeryBoss.Model.User;
import com.eshlon.BakeryBoss.Repo.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService{
	
	@Autowired
	UserRepository userRepo;
	
	

}
