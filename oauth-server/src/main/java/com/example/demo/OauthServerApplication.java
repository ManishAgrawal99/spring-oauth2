package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class OauthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthServerApplication.class, args);
	}

}

/*
 * To get Access Token
 * 
 * POST REQUEST
 * localhost:8282/oauth/token?grant_type=password&username=Manish&password=ManishPass
 * 
 * 
 * To Check Token
 * localhost:8282/oauth/check_token?token=bc7cb519-081b-46d0-88fa-5d7800d863f3
 * 
 * **/
 