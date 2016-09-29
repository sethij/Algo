package insertionSort;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			int temp= s.nextInt();
			int j = i-1;
			while(j>=0 && arr[j]>temp){
				arr[j+1] =arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		s.close();
		
		System.out.println(Arrays.toString(arr));
	}

}
