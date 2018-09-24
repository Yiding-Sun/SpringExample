package com.example.server

import com.example.server.form.ThingForm
import org.springframework.jdbc.core.JdbcOperations
import org.springframework.stereotype.Repository

@Repository
class UsingJDBC(jdbcOperations: JdbcOperations) {
	def findByName(name: String): ThingForm = {
		jdbcOperations.queryForObject(
			"SELECT id,name,describe FROM thistable WHERE name = ?",
			(rs, _) => ThingForm(rs.getLong("id"),
				rs.getString("name"),
				rs.getString("describe")),
			name
		)
	}
	
	def save(name: String, describe: String): Unit = {
		jdbcOperations.update(
			"INSERT INTO thistable (name,describe) VALUES ( ?, ?)",
			name, describe
		)
	}
}

