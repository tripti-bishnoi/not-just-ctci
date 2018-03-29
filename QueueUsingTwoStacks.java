package com.resources;

import java.util.Stack;

public class QueueUsingTwoStacks {

	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();

	public void enqueue(int item) {
		s1.push(item);
	}

	public int dequeue() {
		if(!s2.isEmpty())
			return s2.pop();
		
		while (!s1.isEmpty()) {
			s2.push(s1.peek());
			s1.pop();
		}
		return s2.pop();
	}
	
	public int peek(){
		if(!s2.isEmpty())
			return s2.peek();
		
		while (!s1.isEmpty()) {
			s2.push(s1.peek());
			s1.pop();
		}
		return s2.peek();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
