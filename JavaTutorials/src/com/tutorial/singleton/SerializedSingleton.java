package com.tutorial.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

	private static final long serialVersionUID = 7383460552093429352L;

	private SerializedSingleton(){
		
	}
	
	private static class InnerClass{
		private static SerializedSingleton instance=new SerializedSingleton();
		
	}
	public SerializedSingleton getInstance(){
		return InnerClass.instance;
	}
	
	
}
