package com.gwozdz.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface CourseRepository extends CrudRepository<Course, String>{
	
	
	public List<Course> findCoursesByName(String name);
	public List<Course> findCoursesByDescription(String description);
	public List<Course> findByTopicId(String topicId);
	
	
	
}
