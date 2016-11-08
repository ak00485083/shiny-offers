package com.tutorial.singleton;

public class InnerClassSingleton {
	
	private InnerClassSingleton(){
		
	}
	
	private static class InstanceHelperClass{
		private static InnerClassSingleton instance=new InnerClassSingleton();
	}
	
	public InnerClassSingleton getInstance(){
		return InstanceHelperClass.instance;
	}

}
