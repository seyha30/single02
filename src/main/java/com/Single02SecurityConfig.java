package com;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author seyha.sin Sep 30, 2022/2022 : 1:43:13 PM
 */
@Configuration
public class Single02SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	      http
	      .authorizeRequests()
	      .anyRequest()
	      .authenticated()
	      .and()
	      .oauth2Login();
	}
	
	

}
