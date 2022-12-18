package arrays;

import java.util.Arrays;

/*
 * You are given an array of 0s and 1s in random order. Segregate 0s on left side and 1s on right side of the array [Basically you have to sort the array]. Traverse array only once. 
 */
public class SegregateZeroOne {
	public static void main(String[]args) {
		int arr[] = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		int len = arr.length;
		
		int izero = 0;
		int ione = 1;
		
		while(izero<len && ione<len) {
			int zeroNo = arr[izero];
			int oneNo = arr[ione];
			if((zeroNo == 0 && oneNo != 0) || (zeroNo == 0 && oneNo == 0)) {
				izero++;
				ione++;
			} else if(zeroNo != 0 && oneNo != 0) {
				ione++;
				
			} else if(zeroNo != 0 && oneNo == 0) {
				int temp = arr[izero];
				arr[izero] = arr[ione];
				arr[ione] = temp;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
