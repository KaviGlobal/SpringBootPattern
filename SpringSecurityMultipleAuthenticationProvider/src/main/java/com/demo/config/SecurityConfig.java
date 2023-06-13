package com.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.demo.component.CustomAuthenticationProvider;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	CustomAuthenticationProvider customAuthProvider;
	
	@Bean
    public AuthenticationManager authManager(HttpSecurity http) throws Exception {
        AuthenticationManagerBuilder authenticationManagerBuilder = 
          http.getSharedObject(AuthenticationManagerBuilder.class);
        authenticationManagerBuilder.authenticationProvider(customAuthProvider);
        authenticationManagerBuilder.inMemoryAuthentication()
            .withUser("memuser")
            .password(passwordEncoder().encode("pass"))
            .roles("USER");
        return authenticationManagerBuilder.build();
    }
	

	@Bean
	public SecurityFilterChain configure(HttpSecurity http, AuthenticationManager authManager) throws Exception {
		
		 http.httpBasic()
         .and()
         .authorizeRequests()
         .requestMatchers("/api/**")
         .authenticated()
         .and()
         .authenticationManager(authManager);
		
		 /*http.authorizeRequests()
         .anyRequest().authenticated().and()
         .httpBasic().and().authenticationManager(authManager);*/
       
		 
		 return http.build();
	      
		
	}
	
	@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
