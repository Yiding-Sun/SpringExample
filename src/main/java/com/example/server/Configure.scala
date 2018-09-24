package com.example.server

import javax.sql.DataSource
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration
import org.springframework.context.annotation.{Bean, Configuration}
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.jdbc.core.JdbcTemplate
import org.thymeleaf.templateresolver.ServletContextTemplateResolver

@Configuration
@EnableJpaRepositories
class Configure extends WebMvcAutoConfiguration {
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
	
	/*@Bean
	def dataSource: EmbeddedDatabase = new EmbeddedDatabaseBuilder()
			.setType(EmbeddedDatabaseType.H2)
        	.addScript("classpath:schema.sql")
        	.addScript("classpath:data.sql")
			.build()*/
	/*def dataSource={
		val dataSource=new SimpleDriverDataSource()
		dataSource.setDriverClass(classOf[org.h2.Driver])
		dataSource.setUrl("jdbc:h2:mem:test;MODE=Oracle;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=TRUE")
		dataSource.setUsername("sa")
		dataSource.setPassword("")
	}*/
	
	@Bean
	def jdbcTemplate(dataSource:DataSource)=new JdbcTemplate(dataSource)
}
