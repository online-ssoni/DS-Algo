package arrays;
import java.util.stream.*;

public class EquillibriumPoint {
	public static void main(String[]args) {
		int arr[] = {10,20,30,40,50};
		int rsum = IntStream.of(arr).sum();
		int lsum = 0;
		Integer pval = null;
		Integer pindex = null;
		for(int i=0; i<arr.length; i++) {
			pindex = i; 
			if(pval != null) {
				 lsum += pval;
				 pval = arr[pindex];
				 rsum -= pval;
			 } else {
				 pval = arr[pindex];
				 rsum -= pval;
			 }
			 if(rsum == lsum) {
				 System.out.println(pval);
			 }
		}
	}
}