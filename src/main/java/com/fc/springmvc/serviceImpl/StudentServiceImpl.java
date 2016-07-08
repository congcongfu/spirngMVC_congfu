package com.fc.springmvc.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fc.springmvc.dao.StudentDao;
import com.fc.springmvc.domain.Student;
import com.fc.springmvc.service.StudentService;
/**
 * @author congfu 
 * @date 2016-07-08
 * */

@Service
public class StudentServiceImpl implements StudentService {
	static{
		System.out.println("hello spring");
	}
	
	@Autowired
	private StudentDao studentDao;

	/**
	 * Insert Student 
	 * @param student
	 * @return String
	 * */
	public String insert(Student student) {
		String result = "0";
		result = studentDao.insert(student);
		return result;
	}

	/**
	 * Find student by id
	 * @param student id
	 * @return Student
	 * */
	public Student findStudent(int id) {
		Student student = studentDao.findStudent(id);
		return student;
	}

	/**
	 * update student
	 * @param Student
	 * @return String
	 * */
	public String update(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Find student by param
	 * @param Map
	 * @return List<Student>
	 * */
	public List<Student> searchStudent(Map<String, String> map) {
		// TODO Auto-generated method stub
		return null;
	}

}
