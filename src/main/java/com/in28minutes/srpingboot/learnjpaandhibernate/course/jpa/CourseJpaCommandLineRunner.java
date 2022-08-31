package com.in28minutes.srpingboot.learnjpaandhibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.srpingboot.learnjpaandhibernate.course.Course;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(4, "Learn AWS from JPA!", "in28minutes"));
		repository.insert(new Course(5, "Learn Azure from JPA!", "in28minutes"));
		repository.insert(new Course(6, "Learn DevOps from JPA!", "in28minutes"));

		repository.deleteById(4);

		System.out.println(repository.findById(5));
		System.out.println(repository.findById(6));
	}

}
