package com.atguigu.list;

import java.util.LinkedList;

public class LinkedListDemo {

	//用LinkedList模拟堆栈或者队列数据结构
	/**
	 * 堆栈:先进后出,手枪弹夹
	 * 队列:先进先出,排队买票
	 */
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.myAdd("abc1");
		queue.myAdd("abc2");
		queue.myAdd("abc3");
		
		while(!queue.isNull()){
			Object obj = queue.myGet();
			System.out.println(obj);
		}
	}
}

//队列
class Queue{
	private LinkedList<Object> linkedList;
	
	//对LinkedList初始化
	public Queue(){
		linkedList = new LinkedList<Object>();
	}
	//增加
	public void myAdd(Object object){
		linkedList.addFirst(object);
	}
	
	//得到
	public Object myGet(){
		Object obj = linkedList.removeLast();
		return obj;
	}
	
	//是否为空
	public boolean isNull(){
		boolean empty = linkedList.isEmpty();
		return empty;
	}
}










