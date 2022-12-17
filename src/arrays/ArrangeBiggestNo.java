package arrays;

import java.util.Arrays;

/*
 * Arrange given numbers to form the biggest number
 */
public class ArrangeBiggestNo {
	public static boolean isSwap(int a, int b) {
		long ab = Long.parseLong(Integer.toString(a) + Integer.toString(b));
		long ba = Long.parseLong(Integer.toString(b) + Integer.toString(a));
		if (ba>ab) {
			return true;
		}
		return false;
	}
	public static void main(String[]args) {
		int arr[] = {1, 34, 3, 98, 9, 76, 45, 4, 12, 121};
		int len = arr.length;
		
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				if(isSwap(arr[i], arr[j])) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
