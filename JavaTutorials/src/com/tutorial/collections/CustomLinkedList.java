package com.tutorial.collections;

import java.util.ArrayList;
import java.util.List;

public class CustomLinkedList {

	
	CustomLinkedList c=new CustomLinkedList();
	
	public static void main(String[] args) {
		List<String> fruits=new ArrayList<>();
		fruits.forEach(fruit->System.out.println(fruit));
		
	}
}

abstract class CustomList{
	abstract void getMyMoney();
}