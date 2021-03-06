package com.cafe24.front.shoppingmall.security;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Authentication
public @interface Authorization {
	
	public enum Role{
		USER, ADMIN
	}
	public Role role() default Role.USER;

}
