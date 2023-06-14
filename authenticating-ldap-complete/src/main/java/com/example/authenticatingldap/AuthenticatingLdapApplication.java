package com.example.authenticatingldap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//https://spring.io.xy2401.com/guides/gs/authenticating-ldap/ ben/benspassword
//https://medium.com/codeops/spring-boot-security-ldap-example-1ce1bdfc5816
public class AuthenticatingLdapApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticatingLdapApplication.class, args);
	}

}
