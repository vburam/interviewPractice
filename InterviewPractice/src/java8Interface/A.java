package java8Interface;

public class A implements FirstInterface,SecondInterface{

	
	
	public static void main(String[] args) {
		A a = new A();
		a.hi();
		
		FirstInterface.hello();
	}

	@Override
	public void hi() {
		// TODO Auto-generated method stub
		SecondInterface.super.hi();
	}
}
