package com.fc.springmvc.domain;

public class Student {
	private int id;
	private String name;
	private int age;
	private String sex;
	private String birthDay;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	
	public String toString(){
		return"name="+name+" ,id="+id+" ,age="+age+" ,sex="+sex+" ,birthDay="+birthDay;
	}
	
}


















