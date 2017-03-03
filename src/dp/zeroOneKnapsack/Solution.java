package dp.zeroOneKnapsack;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args){
		

		Scanner s = new Scanner(System.in);
		System.out.println("Enter max weight ");
		int max_weight = s.nextInt();
		System.out.println("Enter no of weight ");
		int no = s.nextInt();
		System.out.println("Enter weight and their values");
		int[] W = new int[no];
		int[] val = new int[no];
		for(int i =0; i< no; i++){
			W[i] = s.nextInt();
			val[i] = s.nextInt();
		}
		System.out.println(calcMaxVal(max_weight,W,val)); 
		s.close();
		
	}

	private static int calcMaxVal(int max_weight, int[] w, int[] val) {
		int[][] T = new int[w.length+1][max_weight+1];
		
		for(int row=1;row<w.length+1;row++){
			for(int col = 1;col<max_weight+1;col++){
				if(col<w[row-1])
					T[row][col] = T[row-1][col];
				else{
					int sum =val[row-1] + T[row-1][col-w[row-1]];
					if(sum >T[row-1][col])
						T[row][col]= sum;
					else
						T[row][col]= T[row-1][col];
				}
			}
		}
		
		return T[w.length][max_weight];
		
	}

}
