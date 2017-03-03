package dp.longestIncreasingSubSequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> arl = new ArrayList<>();
		while(s.hasNextInt()){
			arl.add(s.nextInt());
		}
		int[] arr = new int[arl.size()];
		int i = 0;
		for (Integer it : arl) {
			arr[i++] = it;
		}
		
		System.out.println("LIS "+calcLIS(arr)); 
		
		
		
		
		s.close();
	}

	private static int calcLIS(int[] arr) {
		int[] L = new int[arr.length];
		Arrays.fill(L, 1);
		for(int i = 1;i<arr.length;i++){
			for(int j= 0;j<i;j++){
				if(arr[i]>arr[j] && L[i]<L[j]+1)
					L[i]= L[j]+1;
			}
		}
		int max = 0;
		for(int i= 0 ;i<L.length;i++){
			if(L[i]>max)
				max = L[i];
		}
		return max;
		
	}

}
