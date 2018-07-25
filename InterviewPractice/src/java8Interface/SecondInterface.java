package java8Interface;

public interface SecondInterface {

	default void hi() {
		System.out.println("Say Hi---2");
	}
	
	static void hello() {
		System.out.println("say hello--2");
	}
}
