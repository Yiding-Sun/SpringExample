package com.example.server.controller

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.{RequestMapping, ResponseBody}

class LoginController {
	
	@RequestMapping(Array("/login"))
	def login = {
		LoggerFactory.getLogger(getClass).info("login")
		"login"
	}
	
}
