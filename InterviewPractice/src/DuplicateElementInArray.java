
public class DuplicateElementInArray {

	
	
	public static void main(String[] args) {
		String[] str= {"abc","def","pqr","abc","lmo"};
		
		for(int i=0;i<=str.length-1;i++) {
			for(int j=i;j<str.length;j++) {
				if(str[i].equals(str[j]) &&(i!=j)) {
					System.out.println("Duplicate Element is "+str[j]);
				} 
			}
		}
	}
}
