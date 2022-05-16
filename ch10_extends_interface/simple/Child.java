package ch10_extends_interface.simple;

public class Child extends Parent {
	
	public Child(String name, int age){
		super(name, age);
	}
	
	@Override
	public void sayHeelo() {
		System.out.println("응애 나 아기 " + super.getName());
	}
	
	
	
}
