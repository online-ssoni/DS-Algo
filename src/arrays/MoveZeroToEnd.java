package arrays;

import java.util.Arrays;

public class MoveZeroToEnd {
	public static void main(String[]args) {
		int arr[] = {1, 2, 0, 0, 0, 3, 6,0,5,0,8};
		int len = arr.length;
		int x = 0;
		int y = x+1;
		while(x<len && y<len) {
			if(arr[x] == 0) {
				if(arr[y] != 0) {
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
					x++;
					y=x+1;
				} else {
					y++;
				}
			} else {
				x++;
				y=x+1;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
