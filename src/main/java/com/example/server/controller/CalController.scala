package com.example.server.controller

import java.math.BigInteger

import com.example.server.form.CalForm
import javax.validation.Valid
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.{BindingResult, Errors}
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod}

@Controller
class CalController {
	@RequestMapping(value = Array("/cal"), method = Array(RequestMethod.GET))
	def get(model: Model): String = {
		model.addAttribute(CalForm(0, 0, "+"))
		"cal"
	}
	
	@RequestMapping(value = Array("/cal"), method = Array(RequestMethod.POST))
	def post(@Valid calForm: CalForm, bindingResult: BindingResult, model: Model): String =
		if (bindingResult.hasErrors) {
			"cal"
		} else {
			val string = calForm.first + calForm.symbol.toString + calForm.second + "=" + calForm.cal
			model.addAttribute("ans", string)
			"forward:/ans"
		}
	
	@RequestMapping(Array("/ans"))
	def ans = "ans"
}
