package com.java_topics.method.override;

public class RuntimeOverrideExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractAnimal a = new Dog();
		System.out.println(a.sound());
	}
}

class Cat extends AbstractAnimal{

	@Override
	String sound() {
		// TODO Auto-generated method stub
		return "meow";
	}

	@Override
	int numberOfLimbs() {
		// TODO Auto-generated method stub
		return 4;
	}
	
}

class Dog extends AbstractAnimal {

	@Override
	String sound() {
		// TODO Auto-generated method stub
		return "ruff";
	}

	@Override
	int numberOfLimbs() {
		// TODO Auto-generated method stub
		return 4;
	}
	
}