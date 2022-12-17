package arrays;
/*
 * Rearrange array such that even index elements are smaller and odd index elements are greater
 */

import java.util.Arrays;

public class EvenSmallOddGreat {
	public static void main(String[]args) {
		int arr[] = {6,4,2,1,8,3};
		int len = arr.length;
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<len-1; i++) {
			if(i%2 == 0) {
				// even odd
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			} else {
				// odd even
				if(arr[i] < arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
