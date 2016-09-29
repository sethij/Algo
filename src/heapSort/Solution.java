package heapSort;

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
		sort(arr,0);
		s.close();
		System.out.println(Arrays.toString(arr));

	}

	private static void sort(int[] arr,int pos) {
		int left = pos*2 +1;
		int right = pos*2 +2;
		if(left >=arr.length)
			return;
		sort(arr, left);
		if(arr[left]>arr[pos]){
			int temp =arr[left];
			arr[left] = arr[pos];
			arr[pos] = temp;
		}
		if(right>=arr.length)
				return;
		sort(arr, right);
		if(arr[right]>arr[pos]){
			int temp =arr[right];
			arr[right] = arr[pos];
			arr[pos] = temp;
		}
	}

}
