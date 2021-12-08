package com.practice;

public class Stack {
	int arr[] = { 10, 24, 93, 55 };
	int index;

	public Stack() {
		index = -1;
	}

	void push(int x) {

		if (index > 5) {
			System.out.println("Stack Overflow");
			return;

		}

		++index;
	}

	void display() {
		
	for(int i=0;i<arr.length;i++) {
		
	System.out.println(arr[i]);
	}
	}
	void pop()
	{
		if(index<0) {
			System.out.println("Stack is empty");
		}
		index--;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack st=new Stack();
		st.push(11);
		st.display();
		st.pop();
		st.display();
	}

}
