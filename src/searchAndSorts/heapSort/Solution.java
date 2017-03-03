package searchAndSorts.heapSort;

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
		heapify(arr,0);
		System.out.println(Arrays.toString(arr));
		while (arr.length>0){
			System.out.print(arr[0]+" ");
			swap(arr, arr.length-1, 0);
		arr = Arrays.copyOf(arr, arr.length-1);	
		heapify(arr,0);
		}
		
		s.close();

	}
	private static void swap(int[] arr, int x, int y){
		int temp = arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	private static void heapify(int[] arr,int pos) {
		int left = pos*2 +1;
		int right = pos*2 +2;
		if(left >=arr.length)
			return;
		heapify(arr, left);
		if(arr[left]>arr[pos]){
			swap(arr, left, pos);
			heapify(arr, left);
		}
		if(right>=arr.length)
				return;
		heapify(arr, right);
		if(arr[right]>arr[pos]){
			swap(arr, right, pos);
			heapify(arr, right);
		}
	}

}
