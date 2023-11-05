package com.example.Configservice.jwtAuthenitication.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.Configservice.jwtAuthenitication.security.JwtAuthenticationFilter;
import com.example.Configservice.jwtAuthenitication.security.Jwtauthentivationenterpoint;

@Configuration
public class Securityconfig {

	@Autowired
	private Jwtauthentivationenterpoint enterpoint;
	
	@Autowired
	private JwtAuthenticationFilter filter;
	
	
	
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		  http.csrf(csrf->csrf.disable())
		  .cors(core->core.disable())
          .authorizeHttpRequests(auth->auth.requestMatchers("/user/**").authenticated().requestMatchers("/**").permitAll())
          .exceptionHandling(excep-> excep.authenticationEntryPoint(enterpoint))
          .sessionManagement(ses->ses.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		  
		  http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
          return http.build();
		 }
	
	
	
	
	
	
	
	
}
