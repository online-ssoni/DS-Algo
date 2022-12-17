package arrays;

import java.util.Arrays;

/*
 * Rearrange positive and negative numbers with constant extra space
 */
public class RearrangePosNeg {
	
	public static void merge(int arr[], int left, int mid, int right, int len) {
		int leftArr[] = new int[mid-left+1];
		int rightArr[] = new int[right-mid];
		
		for(int i=0; i<leftArr.length; i++) {
			leftArr[i] = arr[left+i];
		}
		for(int i=0; i<rightArr.length; i++) {
			rightArr[i] = arr[mid+1+i];
		}
		int arrIndex = left;
		for(int i=0; i<leftArr.length; i++) {
			if(leftArr[i] < 0) {
				arr[arrIndex] = leftArr[i];
				arrIndex++;
			}
		}
		for(int i=0; i<rightArr.length; i++) {
			if(rightArr[i] < 0) {
				arr[arrIndex] = rightArr[i];
				arrIndex++;
			}
		}
		for(int i=0; i<leftArr.length; i++) {
			if(leftArr[i] >= 0) {
				arr[arrIndex] = leftArr[i];
				arrIndex++;
			}
		}
		for(int i=0; i<rightArr.length; i++) {
			if(rightArr[i] >= 0) {
				arr[arrIndex] = rightArr[i];
				arrIndex++;
			}
		}
	}
	
	public static void mergeSort(int arr[], int left, int right, int len) {
		if(left < right) {
			int mid = left + (right-left)/2;
			mergeSort(arr, left, mid, len);
			mergeSort(arr, mid+1, right, len);
			merge(arr, left, mid, right, len);
		}
	}
	public static void main(String[]args) {
		int arr[] = {12,11,-19,-5,6,7,5,-3,-6};
		int len = arr.length;
		mergeSort(arr, 0, len-1, len);
		System.out.println(Arrays.toString(arr));
	}
}
