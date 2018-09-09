package com.atguigu.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
		set.add("adc");
		set.add("ww");
		set.add("dfghc");
		set.add("gfuyt");
		
		for (String string : set) {
			System.out.println(string);
		}
	}
}
