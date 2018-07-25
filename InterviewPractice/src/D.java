import java.util.HashMap;
import java.util.Set;

import javax.xml.stream.events.Characters;

public class D{
	
	
	Character ch=new Character('c');
	
	public static void findOccurance(String s) 
	{
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		char[] str=s.toCharArray();
		
		for(char ch:str) {
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}
			else {
				hm.put(ch, 1);
			}
		}
		
		//Set<Character> set= hm.keySet();
		
		/*for(char ch1:set) {
			if(hm.get(ch1)>1)
		}*/
		
		System.out.println(hm);
	}
	
	public static void main(String[] args) {
		findOccurance("this is test program");
	}
}