
public class FunctionalInterfaceExam  {

	public static void main(String[] args) {
		Sayable se=()->{
			System.out.println("first lambda");
		};
		se.say();
	}
}
