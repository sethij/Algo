package searchAndSorts.bubbleSort;

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
		sort(arr);
		s.close();
		System.out.println(Arrays.toString(arr));

	}

	private static void sort(int[] arr) {
		boolean flag = true;
		while (flag){
			flag = false;
		for(int i = 0;i<arr.length-1;i++){
			if(arr[i+1]<arr[i]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] =temp;
				flag = true;
			}		
		}
		System.out.println(Arrays.toString(arr));
		}
	}

}
