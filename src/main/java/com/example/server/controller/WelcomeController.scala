package com.example.server.controller

import org.slf4j.{Logger, LoggerFactory}
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class WelcomeController {
	val logger: Logger = LoggerFactory.getLogger(this.getClass)
	
	@RequestMapping(Array("welcome", "index"))
	def welcome = "hello"
}
