package com.eshlon.BakeryBoss.Config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	UserDetailsService userDetailsService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService)			
			.passwordEncoder(bCryptPasswordEncoder);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

			http
				.csrf().disable()
				.authorizeRequests()
				// URLs matching for access rights
				.antMatchers("/","/signup", "/register", "/signUpuser", "/jwtAuthentication").permitAll()
				.antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/images/**").permitAll()
				.antMatchers("/*.user").hasAnyAuthority("SUPER_USER", "ADMIN_USER", "SITE_USER")
				.antMatchers("/*.admin").hasAnyAuthority("SUPER_USER", "ADMIN_USER")
				.antMatchers("/**").hasAuthority("SUPER_USER")
				.anyRequest().authenticated()
				.and()
				// form login
				.formLogin()
				.loginPage("/login").permitAll()
				.usernameParameter("email")
				.passwordParameter("password")
				.defaultSuccessUrl("/dashboard.user")
				.and()
				// logout
				.logout()
				.invalidateHttpSession(true)
				.clearAuthentication(true)
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
				.logoutSuccessUrl("/login")
				.and()
				.exceptionHandling()
				.accessDeniedPage("/accessdenied");
	}
	
}