package com.fc.springmvc.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fc.springmvc.domain.Student;
import com.fc.springmvc.service.StudentService;
import com.fc.springmvc.util.ResponseUtils;

import net.sf.serfj.RestController;
@Controller
@RequestMapping("student")
public class StudentController{
	
	@Autowired
	private StudentService service;
	
	@RequestMapping("insert")
	public void insert(HttpServletRequest httpRequest, HttpServletResponse response){
		Student student = new Student();
		student.setAge(11);
		student.setName("Erics");
		student.setSex("male");
		student.setBirthDay("2016-07-08");
		String result = service.insert(student);
		ResponseUtils.renderJson(response, result);
	}
	
	@RequestMapping("findStudent")
	public void findStudent(HttpServletRequest request,HttpServletResponse response){
		Map<String, Object> map = request.getParameterMap();
		for(String key: map.keySet()){
			String[] value = (String[]) map.get(key);
			System.out.println(value);
		}
		System.out.println(map);
		Student student = new Student();
		student = service.findStudent(1);
		ResponseUtils.renderJson(response, student.toString());
	}
}

























