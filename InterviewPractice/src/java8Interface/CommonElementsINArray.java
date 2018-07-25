package java8Interface;

import java.util.HashSet;

public class CommonElementsINArray {

	public static void main(String[] args) {
		int[] first= {1,3,2,7,3,5};
		int[] second= {6,3,2,9,3,12};
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0;i<=first.length-1;i++) {
			for(int j=0;j<=second.length-1;j++) {
				if(first[i]==second[j]) {
					set.add(first[i]);
				}
			}
		}
		
		System.out.println(set);
	}
}
