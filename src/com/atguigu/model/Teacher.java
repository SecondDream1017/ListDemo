package com.atguigu.model;

public class Teacher implements Comparable<Teacher>{

	private String name;
	private int age;
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
	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + "]";
	}
	public int compareTo(Teacher teacher) {
		/**
		 * 先比较年龄,在比较姓名
		 */
		int temp = this.age-teacher.age;
		return temp==0?this.getName().compareTo(teacher.getName()):temp;
	}
	
}
