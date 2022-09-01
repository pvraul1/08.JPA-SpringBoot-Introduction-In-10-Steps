package com.in28minutes.srpingboot.learnjpaandhibernate.course.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.srpingboot.learnjpaandhibernate.course.Course;

@Component
public class CourseSpringDataJpaCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(7, "Learn AWS from SpringDataJPA!", "in28minutes"));
		repository.save(new Course(8, "Learn Azure from SpringDataJPA!", "in28minutes"));
		repository.save(new Course(9, "Learn DevOps from SpringDataJPA!", "in28minutes"));

		repository.deleteById(7L);

		System.out.println(repository.findById(8L));
		System.out.println(repository.findById(9L));

	}

}
