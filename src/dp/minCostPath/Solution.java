package dp.minCostPath;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new  InputStreamReader(System.in));
		int d1 = Integer.parseInt(br.readLine().trim());
		int d2 = Integer.parseInt(br.readLine().trim());
		int[][] ar = new int[d1][d2]; 
		for (int i = 0; i < d1; i++) {
			String[] str = (br.readLine().trim()).split(" ");
			for (int j = 0; j < d2; j++) {
				ar[i][j] = Integer.parseInt(str[j].trim());	
			}
		}
		int m = Integer.parseInt(br.readLine().trim());
		int n = Integer.parseInt(br.readLine().trim());
		int[][] cost = new int[d1][d2];
		for (int i = 0; i <=m; i++) {
			for (int j = 0; j < d2; j++) {// have to consider... to loop it upto n
				if(i ==0 && j == 0)
					cost[i][j] = ar[i][j];
				else if(i == 0){
					cost[i][j] = cost[i][j-1]+ar[i][j];
				}
				else if(j == 0){
					cost[i][j] = cost[i-1][j] + ar[i][j];
				}
				else{
					if(cost[i-1][j] <= cost[i-1][j-1] && cost[i-1][j] <= cost[i][j-1])
						cost[i][j] = ar[i][j]+ cost[i-1][j];
					else if(cost[i-1][j-1] <= cost[i-1][j] && cost[i-1][j-1] <= cost[i][j-1])
						cost[i][j] = ar[i][j]+ cost[i-1][j-1];
					else
						cost[i][j] = ar[i][j]+ cost[i][j-1];
				}
				
			}
		}
		for (int[] is : cost) {
			System.out.println(Arrays.toString(is));
		}
		System.out.println("Cost for to reach ("+m+","+n+") is "+cost[m][n]);
	}

}
