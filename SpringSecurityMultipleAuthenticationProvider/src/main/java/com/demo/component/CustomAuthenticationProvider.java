package com.demo.component;

import java.util.Collections;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

//AuthenticationProvider helps you to validate user credentials, 
//it also used to fetch information from DB, LDAP etc.,
@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

	@Override
	public Authentication authenticate(Authentication auth) throws AuthenticationException {
		// TODO Auto-generated method stub
		String username = auth.getName();
		String password = auth.getCredentials().toString();
		if ("externaluser".equals(username) && "pass".equals(password)) {
			return new UsernamePasswordAuthenticationToken(username, password, Collections.emptyList());
		}
		else {
			throw new BadCredentialsException("External system authentication failed");
		}
	}

	@Override
	public boolean supports(Class<?> auth) {
		// TODO Auto-generated method stub
		return auth.equals(UsernamePasswordAuthenticationToken.class);
	}

}
