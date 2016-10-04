package quickSort;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]= s.nextInt();
		}
		s.close();
		sort(arr,n-1);
		System.out.println(Arrays.toString(arr));

	}

	private static void sort(int[] arr, int pivot) {
		//for(int i = pivot;i<0;i++)
		int low = 0;
		int high = pivot-1;
		partition(arr, low,high,pivot);
	}

	private static void partition(int[] arr, int low, int high, int pivot) {
		
		while(low<high){
			while(arr[low]<arr[pivot])
				low++;
			while(arr[high]>arr[pivot])
				high--;
			swap(arr, low,high);	
		}
			swap(arr, low, pivot);
		//pivot = low;
		if(low>0){
			partition(arr, 0, pivot-1, low-1);
		}
		
	}
	
	private static void swap(int[] arr, int x, int y){
		int temp = arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}

}
