package javaPrograms;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayDescendingOrder {

	public static void main(String[] args) {
		int[] num={5,7,9,1,2,4,8};
		Arrays.sort(num);
		for (int i = num.length-1; i >=0; i--) {
			
			System.out.println(num[i]);
			
		}
	
		
		

		

	}

}
