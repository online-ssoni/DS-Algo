package arrays;

import java.util.Arrays;

/*
 * Rearrange array such that even positioned are greater than odd
 */
public class EvenPosGtOdd {
	public static void main(String[]args) {
		int arr[] = {1,7,10,2,5,6,3,9,11,8,4};
		int len = arr.length;
		Arrays.sort(arr);
		int res[] = new int[len];
		int a = 0;
		int b = 0;
		while(a<len && b<len) {
			res[b] = arr[a];
			b+=2;
			a++;
			if(b >= len) {
				b = 1;
			}
		}
		System.out.println(Arrays.toString(res));
	}
}
