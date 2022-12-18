package arrays;

import java.util.Arrays;

/*
 * Replace every array element by multiplication of previous and next
 */
public class MultiplyPrevNext {
	public static void main(String[]args) {
		int arr[] = {2,3,4,5,6};
		int len = arr.length;
		int prev = arr[0];
		arr[0] = arr[0]*arr[1];
		for(int i=1; i<len-1; i++) {
			int curr = arr[i];
			arr[i] = prev * arr[i+1];
			prev = curr;
		}
		arr[len-1] = prev*arr[len-1];
		System.out.println(Arrays.toString(arr));
	}
}
