package selectionSort;

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
		
		for(int i = 0;i<arr.length;i++){
			int min = arr[i];
			int pos=i;
			for(int j = i+1;j<arr.length;j++){
				if(arr[j]<min){
					min = arr[j];
					pos = j;
				}
			}
			arr[pos] = arr[i];
			arr[i] = min;
			//System.out.println(Arrays.toString(arr));
		}
		
	}

}
