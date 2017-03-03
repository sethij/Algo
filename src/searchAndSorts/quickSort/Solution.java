//Quick sort using last element as last
package searchAndSorts.quickSort;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	static int i=0;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]= s.nextInt();
		}
		s.close();
		System.out.println(Arrays.toString(arr));
		sort(arr,n-1);
		System.out.println(Arrays.toString(arr));

	}

	private static void sort(int[] arr, int pivot) {
		//for(int i = pivot;i<0;i++)
		int low = 0;
		int high = pivot;
		partition(arr, low,high);
	}

	private static void partition(int[] arr, int lowOri, int highOri) {
		int low = lowOri;
		int pivot = highOri;
		int high = highOri-1; 
		
		if(low>=high)//*** other solution step 1. if(low>high)
			return;
		
		while(low<high){
			
			while(arr[low]<arr[pivot] && low<high)
				low++;
			while(arr[high]>arr[pivot] && low<high)
				high--;
			swap(arr, low,high);

		}
		
		//swap pivot element with the low or high if pivot is smaller... 
		if(arr[low]>arr[pivot])
			swap(arr,low,pivot);
		else //*** other solution step 2. remove else.
			low=pivot;
		//System.out.println("After iteration " +(i++) +" "+Arrays.toString(arr));
	
		partition(arr, lowOri, low-1);//*** other solution step 3. partition(arr, lowOri, low);  
		partition(arr, high+1, pivot);
			
		
	}
	
	private static void swap(int[] arr, int x, int y){
		int temp = arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}

}
