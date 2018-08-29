package com.example.server.form


import javax.validation.constraints.NotNull

import scala.beans.BeanProperty

case class CalForm(@BeanProperty @NotNull first: Int, @BeanProperty @NotNull  second: Int, @BeanProperty @NotNull method: String) {
	def symbol: CalForm.Method.Value = CalForm.Method.values.find(_.toString == method).get
	
	def cal: Int = symbol match {
		case CalForm.Method.PLUS => first + second
		case CalForm.Method.MINUS => first - second
		case CalForm.Method.TIMES => first * second
		case CalForm.Method.DIVIDE => first / second
	}
	
}

object CalForm {
	
	object Method extends Enumeration {
		type Method = Value
		val PLUS: Value = Value("+")
		val MINUS: Value = Value("-")
		val TIMES: Value = Value("*")
		val DIVIDE: Value = Value("/")
	}
	
}
