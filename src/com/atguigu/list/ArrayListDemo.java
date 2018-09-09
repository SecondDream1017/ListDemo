package com.atguigu.list;

import java.util.ArrayList;
import java.util.HashSet;

import com.atguigu.model.Student;

public class ArrayListDemo {

	//去掉List集合中重复的元素
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>(0);
		/*list.add("abc1");
		list.add("abc1");
		list.add("abc2");
		list.add("abc2");
		list.add("abc3");
		list.add("abc3");*/
		
		list.add(new Student("aa","22"));
		list.add(new Student("aa","22"));
		list.add(new Student("bb","66"));
		list.add(new Student("bb","66"));
		
		//方法1,用HashSet
		HashSet<Object> h = new HashSet<Object>(list);
		list.clear();
		list.addAll(h);
		System.out.println(list);
		
		//方法2,创建临时容器,在放回原List里
		/*ArrayList<Object> listTemp = new ArrayList<Object>(0);
		for (Object str : list) {
			if(!listTemp.contains(str)){
				listTemp.add(str);
			}
		}
		list.clear();			//删除所有元素
		list.addAll(listTemp);	//将临时容器中的元素放到原List中
		System.out.println(list);*/
		
	}
	
}
