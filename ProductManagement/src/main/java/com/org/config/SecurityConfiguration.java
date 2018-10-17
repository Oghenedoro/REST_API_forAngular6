package com.org.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

import com.org.service.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
//@EnableJpaRepositories
//@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private CustomUserDetailsService userDetailsService;
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.userDetailsService(userDetailsService).passwordEncoder(NoOpPasswordEncoder.getInstance());

	}		
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.httpBasic()
			.and()
				.authorizeRequests()
					.antMatchers("/app/**")
						.hasRole("USER")
							.antMatchers("/app**")
								.hasRole("ADMIN")																
								   .and()	
									.csrf().disable().headers()
										.frameOptions().disable();		
		
	  } 	
	
	}