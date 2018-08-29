package com.example.server.form

import org.junit.{Assert, Test}


class CalFormTest{
	@Test
	def testEnum(): Unit ={
		Assert.assertEquals(CalForm.Method.PLUS.toString,"+")
		Assert.assertEquals(CalForm.Method.values.find(_.toString=="+").get,CalForm.Method.PLUS)
	}
}
