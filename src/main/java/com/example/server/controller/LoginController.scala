package com.example.server.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class LoginController {
	
	@RequestMapping(Array("/login"))
	def login = "login"
	
	
}
