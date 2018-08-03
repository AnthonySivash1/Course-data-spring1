package io.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;


  //get all courses
    public List<Course> getAllCourses(String topicId){
    	List<Course> courses=new ArrayList<>();
    	courseRepository.findByTopicId(topicId)
    	.forEach(courses::add);
    	return courses;
    }
    //get oject by id
    public Optional<Course> getCourse(String id)
    {
    	
    	return courseRepository.findById(id);
    }
//post emthod
	public void addCourse(Course course) {
		courseRepository.save(course);
		
	}
	public void updateCourse(Course course) {
		courseRepository.save(course);
		
	}
	public void deleteCourse(String id) {
		// TODO Auto-generated method stub
		courseRepository.deleteById(id);
	}
}

