package com.biz.classes.service.parents;

public class Animal {

	protected String name;
	
	// new Animal() 코드로 호출되는 method
	public Animal() {

		this.name = "동물의 왕";
	}

	public String getName() {
		return this.name;
	}
}
