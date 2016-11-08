package com.tutorial.singleton;

public class LazySynchronizedSingleton {
	
	private static LazySynchronizedSingleton instance;
	
	private LazySynchronizedSingleton(){
		
	}
	
	public static synchronized LazySynchronizedSingleton getInstance(){
		if(instance==null){
			
			instance=new LazySynchronizedSingleton();
		}
		return instance;
	}

}
