package com.tutorial.singleton;

public class StaticBlockSingleton {
private static StaticBlockSingleton instance;
	static{
		try {
			
			instance=new StaticBlockSingleton();
		} catch (Exception e) {
			System.out.println("got exception"+e);
		}
	}
	
	public static  StaticBlockSingleton getInstance(){
		return instance;
			
	}
	
}
