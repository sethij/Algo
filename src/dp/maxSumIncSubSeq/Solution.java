package dp.maxSumIncSubSeq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		String[] str = br.readLine().trim().split(" ");
		int[] arr = new int[n];
		int[] lis = new int[n];
		int max  = 0;
		for (int i = 0; i <n; i++) {
			arr[i]= Integer.parseInt(str[i].trim());
			}
		lis[0] = arr[0];
		max = arr[0];
		for (int i = 1; i <n; i++) {
			for(int j = 0;j<i;j++){
				if(arr[i]>arr[j] && lis[i] < arr[i]+lis[j]){
					lis[i]= arr[i]+lis[j];
					if(max<lis[i])
						max = lis[i];
				}
					
			}
			
		}
		System.out.println(Arrays.toString(lis));
		System.out.println("max sum of increasing subsequence "+max);

	}

}
