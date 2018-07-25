
public interface Sayable {

	public void say();
	
	@Override
	int hashCode();
	
	@Override
	boolean equals(Object obj);
	
	static void m1() {
		System.out.println("m1");
	}
	
	default void m2() {
		System.out.println("m2");
	}
	
	@Override
	default String toString() {
		return null;
	}
}
