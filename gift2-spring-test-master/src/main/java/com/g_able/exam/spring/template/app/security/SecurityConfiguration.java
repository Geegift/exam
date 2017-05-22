package com.g_able.exam.spring.template.app.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.g_able.exam.spring.template.core.filter.SimpleFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
    protected void configure(HttpSecurity http) throws Exception {
		http
			.sessionManagement()
			.sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED);

		http
			.csrf().disable();
		http
			.authorizeRequests()
			.antMatchers("/","/**")
			.anonymous().anyRequest()
			.authenticated()
		.and()
			.addFilterBefore(new SimpleFilter(), BasicAuthenticationFilter.class);
	
	}
	
	
	
	
}
