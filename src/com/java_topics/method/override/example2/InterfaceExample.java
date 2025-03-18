package com.java_topics.method.override.example2;

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Audi();
		
		System.out.println(car.brandName());
	}

}

class Audi implements Car{

	@Override
	public String brandName() {
		// TODO Auto-generated method stub
		return "Audi";
	}

	@Override
	public int topSpeed() {
		// TODO Auto-generated method stub
		return 180;
	}

	@Override
	public boolean isConvertible() {
		// TODO Auto-generated method stub
		return true;
	}
	
}

class Honda implements Car{

	@Override
	public String brandName() {
		// TODO Auto-generated method stub
		return "Honda";
	}

	@Override
	public int topSpeed() {
		// TODO Auto-generated method stub
		return 175;
	}

	@Override
	public boolean isConvertible() {
		// TODO Auto-generated method stub
		return false;
	}
}