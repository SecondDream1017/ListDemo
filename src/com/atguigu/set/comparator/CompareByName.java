package com.atguigu.set.comparator;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import com.atguigu.model.User;

public class CompareByName implements Comparator<User> {

	public int compare(User user1, User user2) {
		/**
		 * 先比较姓名,再比较年龄
		 */
		int temp = user1.getName().compareTo(user2.getName());
		return temp==0?user1.getAge()-user2.getAge():temp;
	}

	public static <T, U extends Comparable<? super U>> Comparator<T> comparing(
			Function<? super T, ? extends U> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T, U> Comparator<T> comparing(
			Function<? super T, ? extends U> arg0, Comparator<? super U> arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T> Comparator<T> comparingDouble(
			ToDoubleFunction<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T> Comparator<T> comparingInt(ToIntFunction<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T> Comparator<T> comparingLong(ToLongFunction<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T> Comparator<T> nullsFirst(Comparator<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T> Comparator<T> nullsLast(Comparator<? super T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	public Comparator<User> reversed() {
		// TODO Auto-generated method stub
		return null;
	}

	public Comparator<User> thenComparing(Comparator<? super User> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <U extends Comparable<? super U>> Comparator<User> thenComparing(
			Function<? super User, ? extends U> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <U> Comparator<User> thenComparing(
			Function<? super User, ? extends U> arg0, Comparator<? super U> arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public Comparator<User> thenComparingDouble(
			ToDoubleFunction<? super User> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Comparator<User> thenComparingInt(ToIntFunction<? super User> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Comparator<User> thenComparingLong(ToLongFunction<? super User> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
