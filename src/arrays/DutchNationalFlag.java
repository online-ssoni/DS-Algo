package arrays;

import java.util.Arrays;

public class DutchNationalFlag {
	public static void main(String[]args) {
		int arr[] = {1,0,1,1,2,0,1,2};
		int len = arr.length;
		int a = 0;
		int b = 0;
		int c = len-1;
		while(b<len & c>=b) {
			if(arr[b]==0) {
				int temp = arr[a];
				arr[a] = arr[b];
				arr[b] = temp;
				a++;
				b++;
			} else if(arr[b] == 1) {
				b++;
			} else {
				int temp = arr[c];
				arr[c] = arr[b];
				arr[b] = temp;
				c--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
