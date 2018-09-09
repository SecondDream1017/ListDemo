package com.atguigu.set;

import java.util.TreeSet;

import com.atguigu.model.User;
import com.atguigu.set.comparator.CompareByName;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		//按照姓名排序
		TreeSet<User> treeSet = new TreeSet<User>(new CompareByName());
		treeSet.add(new User("lisi3",34));
		treeSet.add(new User("lisi1",37));
		treeSet.add(new User("lisi6",23));
		treeSet.add(new User("lisi4",16));
		
		for (User user : treeSet) {
			System.out.println(user);
		}
	}
}



