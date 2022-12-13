package javaPrograms;

import java.util.Iterator;

public class PrintDuplicate {

	public static void main(String[] args) {
		int[] num= {1,4,7,8,5,1,4,7};
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				
				if (num[i]==num[j]) {
					System.out.println(num[i]);
					
				}
			}
			
		}

	}

}
