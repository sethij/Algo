package searchAndSorts.mergeSort;

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
		
		mergeSort(arr,0,n-1);
		System.out.println(Arrays.toString(arr));
	}
	
	private static void mergeSort(int[] arr, int l, int r) {
		
		if(l== r)
			return;
		int m= (l+r)/2;
		mergeSort(arr, l, m);
		mergeSort(arr, m+1, r);
		
		merge(arr,l,m,r);
	
	}

	private static void merge(int[] arr, int l, int m, int r) {
		if(l == r)
			return;
		for(int i = m+1;i<=r;i++){
			int temp = arr[i];
			int j = i-1;
			while(j>=l && arr[j]>temp){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		//System.out.println(Arrays.toString(arr));
		
	}

}
