package com.fc.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fc.springmvc.util.ResponseUtils;

@RestController
@RequestMapping("login")
public class LoginController {

	@RequestMapping("valid")
	public void validMessage(HttpServletRequest request, HttpServletResponse response){
		String result ="hello http requst seccuess!";
		ResponseUtils.renderJson(response, result);;
	}
}
