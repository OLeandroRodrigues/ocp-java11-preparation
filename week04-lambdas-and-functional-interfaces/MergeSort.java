import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		 //int[] arr = new int[]{10,9,8,8,6,5,4,3,2,1};
		 int[] arr = new int[]{9,8,7,6,5,4,3,2,1};
		 int[] arrSorted = new MergeSort().mergeSort(arr);
		 
		 for(int i = 0; i < arrSorted.length; i++ ) {
			 System.out.print(arrSorted[i] + ",");
		 }

	}
	
	 public int[] mergeSort(int[] arr){
		  
		  if (arr.length <= 1) {
			  return arr;
		  }
		  
		  int mid = arr.length / 2;
		  int[] L = Arrays.copyOfRange(arr, 0, mid);
		  int[] R = Arrays.copyOfRange(arr, mid, arr.length);
		  
		  mergeSort(L);
		  mergeSort(R);
		  
		  int i = 0, j = 0, k = 0;
		  
		  while (i < L.length && j < R.length) {
			  if(L[i] <= R[j]) {
				  arr[k] = L[i];
				  i += 1;
			  }else {
				  arr[k] = R[j];
				  j += 1;
			  }
			  k += 1;
		  }
		  
		  while(i < L.length) {
			  arr[k] = L[i];
			  i += 1;
			  k += 1;
		  }
		  
		  while(j < R.length) {
			  arr[k] = R[j];
			  j += 1;
			  k += 1;
		  }
		  
	      return arr;
	  }

}
