package com.fc.springmvc.daoImpl;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

import com.fc.springmvc.dao.StudentDao;
import com.fc.springmvc.domain.Student;

/**
 * @author congfu
 * @date 2016-07-08
 * */
@Repository
public class StudentDaoImpl implements StudentDao {

	public String insert(Student student) {
		String result = "0";
		try{
			if(student != null){
				if (student.getAge() != 0) {
					result = "1";
				}
			}
		}catch(Exception e){
			System.err.println(e.getMessage());
		}
		return result;
	}

	public Student findStudent(int id) {
		Student student = new Student();
		try{
			student.setId(id);
			student.setAge(21);
			student.setName("你聪哥");
			student.setSex("male");
			student.setBirthDay("2016-07-08");
		}catch(Exception e){
			System.err.println(e.getMessage());
		}
		return student;
	}

	public String update(Student student) {
		return null;
	}

	public List<Student> searchStudent(Map<String, String> map) {
		return null;
	}

}
