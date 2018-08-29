package com.example.server

import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpMethod
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.{EnableWebSecurity, WebSecurityConfigurerAdapter}

@Configuration
@EnableWebSecurity
class SecurityConfig extends WebSecurityConfigurerAdapter {
	override def configure(auth: AuthenticationManagerBuilder): Unit = {
		auth.inMemoryAuthentication()
				.withUser("user").password("{noop}pass").roles("USER").and()
				.withUser("admin").password("{noop}password").roles("USER", "ADMIN")
	}
	
	override def configure(http: HttpSecurity): Unit = {
		http.authorizeRequests
				.anyRequest.permitAll()
				.and
				.formLogin
        		.and
        		.httpBasic
        		.and
        		.rememberMe.tokenValiditySeconds(900)
	}
}
