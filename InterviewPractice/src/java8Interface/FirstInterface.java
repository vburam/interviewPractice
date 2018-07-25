package java8Interface;

public interface FirstInterface {

	default void hi() {
		System.out.println("Say HI---1");
	}
	
	static void hello() {
		System.out.println("say hello---1");
	}
}
