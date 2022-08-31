package com.in28minutes.srpingboot.learnjpaandhibernate.course;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

	private long id;
	private String name;
	private String author;

}
