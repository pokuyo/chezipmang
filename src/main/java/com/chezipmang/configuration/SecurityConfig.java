package com.chezipmang.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(WebSecurity web) throws Exception {
		
		// static directory 하위파일 목록 인증 무시
		web.ignoring().antMatchers(
				"/css/**",
        		"/fonts/**",
        		"/images/**",
        		"/img/**",        		
        		"/js/**",
        		"/main/css/**",
        		"/main/js/**",
        		"/plugins/**",
        		"/sample/**",
        		"/*.ico"
		);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
	}
	
}
