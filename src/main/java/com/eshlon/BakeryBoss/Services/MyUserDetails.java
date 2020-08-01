package com.eshlon.BakeryBoss.Services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.eshlon.BakeryBoss.Model.User;

public class MyUserDetails implements UserDetails{
	
	
	private User user;
	
	public MyUserDetails(User user) {
		this.user = user;
	}
	
	public MyUserDetails() {
		// TODO Auto-generated constructor stub
	}

	
}
