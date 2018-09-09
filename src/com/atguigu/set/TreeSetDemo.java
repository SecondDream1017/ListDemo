package com.atguigu.set;

import java.util.TreeSet;
import com.atguigu.model.Teacher;

public class TreeSetDemo {

	public static void main(String[] args) {
		//使用TreeSet存放对象,该对象要实现Compareable接口
		//因为TreeSet默认要排序,在该对象中设置以什么排序
		TreeSet<Teacher> set = new TreeSet<Teacher>();
		set.add(new Teacher("ff",22));
		set.add(new Teacher("ww",26));
		set.add(new Teacher("aa",22));
		set.add(new Teacher("cc",25));
		
		for (Teacher teacher : set) {
			System.out.println(teacher);
		}
	}
}
