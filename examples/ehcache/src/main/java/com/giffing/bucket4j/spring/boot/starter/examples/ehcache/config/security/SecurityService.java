package com.giffing.bucket4j.spring.boot.starter.examples.ehcache.config.security;

import java.util.Objects;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service(value = "securityService")
public class SecurityService {

	public String username() {
		return "";
//		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//		if(authentication == null) {
//			return "";
//		}
//		String name = authentication.getName();
//		if(Objects.equals(name, "anonymousUser")) {
//			return "";
//		}
//		return name;
	}
//	public String notSignedIn(){
//		return "anonymousUser";
//	}
	
}
