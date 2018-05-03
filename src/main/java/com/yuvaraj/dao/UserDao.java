package com.yuvaraj.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.yuvaraj.model.User;

public class UserDao {
	
public void insert(User user) {
	//System.out.println("dao");
	//String sql="insert into user_detail" + "(name,last_name,email_id,mob_num,password) values(?,?,?,?,?)";
	//JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
	//jdbcTemplate.update(sql,new Object[] {user.getName(),user.getLastName(),user.getEmailId(),user.getmNum(),user.getPassword()}); 
	//System.out.println("completed");
	
	}
}
