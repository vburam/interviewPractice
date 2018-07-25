import java.util.HashMap;

final public class TestImmutable {

	HashMap<K, V> m  = new HashMap<>();
	private int i;
	
	public TestImmutable(int i) {
		
		this.i=i;
		
	}
	
	public TestImmutable modify(int i) {
		if(this.i=i) {
			return this;
		}
		else {
			return (new TestImmutable(i));
		}
	}
	
	public static void main(String[] args) {
		TestImmutable t1= new TestImmutable(10);
	}
}
