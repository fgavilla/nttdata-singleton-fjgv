package com.nttdata.bootcamp.patterns.singleton;

import com.nttdata.bootcamp.patterns.pattern.Person;

public class Singleton {
	//siempre misma memoria sobreescribiendo el objeto
	private static Person INSTANCE;
	
	public static Person getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Person();
		}
		return INSTANCE;
	}

}
