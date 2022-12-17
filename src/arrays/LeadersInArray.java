package arrays;

import java.util.Stack;

public class LeadersInArray {
	public static void main(String[]args) {
		int arr[] = {16, 17, 4, 3, 5, 2};
		int len = arr.length;	
		Stack<Integer> st = new Stack<>();
		int max = arr[len-1];
		st.add(max);
		for(int i=len-2; i>=0; i--) {
			if(arr[i] > max) {
				max = arr[i];
				st.add(max);
			}
		}
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
	}
}
