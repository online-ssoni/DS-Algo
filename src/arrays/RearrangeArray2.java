package arrays;

import java.util.Arrays;

/*
 * Rearrange array such that arr[i] >= arr[j] 
 * if i is even and arr[i]<=arr[j] if i is odd and j < i
 */
public class RearrangeArray2 {
	public static void main(String[]args) {
		int arr[] = {1,2,3,4,5,6,7};
		int len = arr.length;
		int res[] = new int[len];
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int i = len-1;
		if(len%2==0) {
			i-=1;
		}
		int x=0;
		while(x<len && i>=0) {
			res[i] = arr[x];
			x++;
			i-=2;
		}
		if(i==-1) {
			i=0;
		} else {
			i=1;
		}
		while(i<len && x<len) {
			res[i] = arr[x];
			x++;
			i+=2;
		}
		
		System.out.println(Arrays.toString(res));
		
		
	}
}
