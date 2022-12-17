package arrays;

import java.util.Arrays;

/*
 * Rearrange positive and negative numbers in O(n) time and O(1) extra space
 */
public class RearrangePositiveNegative {
	public static void main(String[]args) {
		int arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
		int len = arr.length;
		
		boolean flag = true;
		
		int x = 0;
		int y = 1;
		while(x < len && y < len) {
			if(flag){
				if(arr[x] >= 0) {
					x++;
					y = x+1;
					flag = !flag;
				}else {
					if(arr[y] >= 0) {
						int temp = arr[x];
						arr[x] = arr[y];
						arr[y] = temp;
						x++;
						y=x+1;
						flag = !flag;
					}else {
						y++;
					}
				}
			}else {
				if(arr[x] >= 0) {
					if(arr[y]>=0) {
						y++;
					} else {
						int temp = arr[x];
						arr[x] = arr[y];
						arr[y] = temp;
						x++;
						y=x+1;
						flag = !flag;
					}
				} else {
					x++;
					y=x+1;
					flag = !flag;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
