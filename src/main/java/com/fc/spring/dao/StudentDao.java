package com.fc.spring.dao;

import java.util.List;
import java.util.Map;

import com.fc.springmvc.domain.Student;

/**
 * StudentDao
 * @author congfu
 * @date 2016-07-08
 * */
public interface StudentDao {
	/**
	 * Insert Student 
	 * @param student
	 * @return String
	 * */
	public String insert(Student student);
	
	/**
	 * Find student by id
	 * @param student id
	 * @return Student
	 * */
	public Student findStudent(int id);
	
	/**
	 * update student
	 * @param Student
	 * @return String
	 * */
	public String update(Student student);
	
	/**
	 * Find student by param
	 * @param Map
	 * @return List<Student>
	 * */
	public List<Student> searchStudent(Map<String, String>  map);
}
