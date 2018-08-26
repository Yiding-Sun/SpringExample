package com.example.server

import org.slf4j.{Logger, LoggerFactory}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{RequestMapping, ResponseBody}

@Controller
class WelcomeController {
	val logger: Logger = LoggerFactory.getLogger(this.getClass)
	
	@RequestMapping(Array("welcome", "index"))
	def welcome = "hello"
}
