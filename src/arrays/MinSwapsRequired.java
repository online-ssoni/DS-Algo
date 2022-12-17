package arrays;

import java.util.stream.IntStream;

/*
 * Minimum swaps required to bring all elements less than or equal to k together
 */

public class MinSwapsRequired {
	public static void main(String[]args) {
		int arr[] = {2,7,9,5,8,7,4};
		int len = arr.length;
		int k = 5;
		int lteCount = 0;
		
		for(int i=0; i<len; i++) {
			if(arr[i] <= k) {
				lteCount++;
			}
		}
		
		if(lteCount != 0) {
			int i = 0;
			int j = lteCount-1;
			int minSwaps = k;
			while(i<len & j<len) {
				int cSwap = 0;
				for(int a=i; a<=j; a++) {
					if(arr[a] > k) {
						cSwap++;
					}
				}
				if(cSwap < minSwaps) {
					minSwaps = cSwap;
				}
				i++;
				j++;
			}
			System.out.println(minSwaps);
		}
	}
}
