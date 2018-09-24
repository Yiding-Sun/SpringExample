package com.example.server.controller

import com.example.server.UsingJDBC
import com.example.server.form.{InsertForm, SelectForm, ThingForm}
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.{PathVariable, RequestMapping, RequestMethod}

@Controller
@RequestMapping(Array("/jdbc"))
class JdbcController(@Autowired usingJDBC: UsingJDBC) {
	val logger = LoggerFactory.getLogger(getClass)
	
	@RequestMapping(Array(""))
	def page(model:Model): String = {
		model.addAttribute(SelectForm(""))
		model.addAttribute(InsertForm("",""))
		"database"
	}
	
	@RequestMapping(path = Array("/select"), method = Array(RequestMethod.POST))
	def select(selectForm: SelectForm, model: Model): String = {
		logger.info(selectForm.name)
		val ans = usingJDBC.findByName(selectForm.name)
		logger.info(ans.toString)
		model.addAttribute(ans)
		"database_show"
	}
	
	@RequestMapping(path = Array("/insert"), method = Array(RequestMethod.POST))
	def insert(insertForm: InsertForm, model: Model): String = {
		logger.info(insertForm.toString)
		usingJDBC.save(insertForm.name,insertForm.describe)
		model.addAttribute(ThingForm(-1, insertForm.name, insertForm.describe))
		"database_show"
	}
}
