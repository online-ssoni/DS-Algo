package arrays;

import java.util.Arrays;

/*
 * Given an array A[], write a function that segregates even and odd numbers. The functions should put all even numbers first, and then odd numbers.
 */
public class SegregateEvenOdd {
	public static void main(String[]args) {
		int arr[] = {12, 34, 45, 9, 8, 90, 3};
		int len = arr.length;
		
		int e=0;
		int o=1;
		
		while(e<len && o<len) {
			int evenNo = arr[e];
			int oddNo = arr[o];
			if((evenNo%2 == 0 && oddNo%2 != 0) || (evenNo%2 == 0 && oddNo%2 == 0)) {
				e++;
				o++;
			} else if(evenNo%2 != 0 && oddNo%2 != 0) {
				o++;
				
			} else if(evenNo%2 != 0 && oddNo%2 == 0) {
				int temp = arr[e];
				arr[e] = arr[o];
				arr[o] = temp;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
