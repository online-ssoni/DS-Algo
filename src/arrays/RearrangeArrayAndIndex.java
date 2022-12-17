package arrays;

import java.util.Arrays;

/*
 * Rearrange an array such that arr[i] = i
 */
public class RearrangeArrayAndIndex {
	public static void main(String[]args) {
		int arr[] = {19,7,0,3,18,15,12,-1,1,8,11,10,9,5,13,16,2,14,17,4};
		int len = arr.length;
		for(int i=0; i<len; i++) {
			if(arr[i] != -1 && arr[i] != i) {
				int x = arr[i];
				while(arr[x] != -1 && arr[x] != x) {
					int y = arr[x];
					arr[x] = x;
					x = y;
				}
				arr[x] = x;
				if(arr[i] != i) {
					arr[i] = -1;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
