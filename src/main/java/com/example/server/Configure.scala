package com.example.server

import org.springframework.boot.SpringBootConfiguration
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration
import org.springframework.context.annotation.{Bean, Configuration}
import org.springframework.web.servlet.ViewResolver
import org.thymeleaf.TemplateEngine
import org.thymeleaf.spring5.SpringTemplateEngine
import org.thymeleaf.spring5.view.ThymeleafViewResolver
import org.thymeleaf.templateresolver.ServletContextTemplateResolver
@Configuration
@SpringBootConfiguration
class Configure extends WebMvcAutoConfiguration{
	/*def viewResolver: ViewResolver = {
		log.info("viewResolver")
		val viewResolver = new ThymeleafViewResolver()
		viewResolver.setTemplateEngine(templateEngine.asInstanceOf[SpringTemplateEngine])
		viewResolver
	}
	
	@Bean
	def templateEngine: TemplateEngine = {
		log.info("templateEngine")
		val templateEngine = new SpringTemplateEngine()
		templateEngine.setTemplateResolver(templateResolver)
		templateEngine
	}
	
	@Bean
	def templateResolver: TemplateResolver = {
		log.info("templateResolver")
		val templateResolver = new ServletContextTemplateResolver()
		templateResolver.setPrefix("/WEB-INF/templates/")
		templateResolver.setSuffix(".html")
		templateResolver.setTemplateMode("HTML5")
		templateResolver
	}*/
}
