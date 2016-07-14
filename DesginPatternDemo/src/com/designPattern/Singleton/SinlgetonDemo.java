package com.designPattern.Singleton;

public class SinlgetonDemo {
	public static void main (String args){
		SingleObject obj = SingleObject.getInstance();
		obj.showMessage();
	}
}
