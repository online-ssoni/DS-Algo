package arrays;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[]args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int len = arr.length;
		int left = 0;
		int right = len-1;
		while(left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		System.out.println(Arrays.toString(arr));
	}
}
