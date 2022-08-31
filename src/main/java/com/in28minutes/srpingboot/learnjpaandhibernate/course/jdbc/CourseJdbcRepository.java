package com.in28minutes.srpingboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.in28minutes.srpingboot.learnjpaandhibernate.course.Course;

@Repository
public class CourseJdbcRepository {

	@Autowired
	JdbcTemplate srpingJdbcTemplate;
	
	private static final String INSERT_QUERY = 
			"""
					insert into course (id, name, author)
					values(?, ?, ?); 
					
			""";
	
	private static final String DELETE_QUERY = "delete from course where id = ?";
	
	public void insert(Course course) {
		srpingJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}

	public void delete(long id) {
		srpingJdbcTemplate.update(DELETE_QUERY, id);
	}

}
