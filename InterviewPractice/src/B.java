
public class B extends A{

	
	static int i=10;
	public static  void show() {
		System.out.println("BBBBBB---BBBBB");
	}
	
public static void main(String[] args) {
	//A a = new B();
	A a =new B();
	System.out.println(a.i);
	a.show();
	}
	
}
