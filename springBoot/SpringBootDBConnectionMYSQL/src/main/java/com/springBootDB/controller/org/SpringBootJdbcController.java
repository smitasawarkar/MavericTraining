package com.springBootDB.controller.org;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootJdbcController {

	
	@Autowired
	JdbcTemplate jdbc;
	
	@RequestMapping("/insert")
	public String index() {
		jdbc.execute("insert into userDetail(name,email) values('sakshi','sakshi@gmail.com')");
		return "Data inserted successfully";
	}
	
	@RequestMapping("/list")
	public List < User > findAll() {
		return jdbc.query("select * from userDetail", new StudentMapper());
	}
	
	
	@RequestMapping("/update")
	public String update(){
		jdbc.update("UPDATE userDetail SET name = 'java', email= 'java@gmail.com' WHERE id = 2 ");
		return "Data UPDATED successfully";
	}
	
	
	@RequestMapping("/delete")
	public String delete(){
		jdbc.execute("delete from userDetail WHERE id = 1 ");
		return "Data UPDATED successfully";
	}
	
	
	class StudentMapper implements RowMapper < User > {
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        	
        	System.out.println("mapRow is called");
        	User std = new User();
            
        	
            std.setName(rs.getString("name"));
            std.setEmail(rs.getString("email"));
            
            return std;
        }
	}
	
}
