package arrays;

import java.util.Arrays;

/*
 * Positive elements at even and negative at odd positions (Relative order not maintained)
 */
public class PosEvenNegOdd {
	public static void main(String[]args) {
		int arr[] = {-1, 3, -5, 6, 3, 6, -7, -4, -9, 10};
		int len = arr.length;
		
		System.out.println(Arrays.toString(arr));
		
		int posPtr = 0;
		int negPtr = 1;
		
		while(posPtr < len && negPtr < len) {
			System.out.println(posPtr + " , " + negPtr);
			if(arr[posPtr] < 0 && arr[negPtr] >= 0) {
				int temp = arr[posPtr];
				arr[posPtr] = arr[negPtr];
				arr[negPtr] = temp;
			}
			if(arr[posPtr] >= 0) {
				posPtr += 2;
			}
			if(arr[negPtr] < 0) {
				negPtr += 2;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
