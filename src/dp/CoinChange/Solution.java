package dp.CoinChange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str0 = br.readLine();
		String[] r = str0.split(" ");
		int max = Integer.parseInt(r[0].trim());
		int noOfCoin = Integer.parseInt(r[1].trim());
		
		String str = br.readLine();
		String[] ar = str.split(" ");
		int[] coins = new int[noOfCoin];
		for(int i = 0;i<noOfCoin;i++){
			coins[i] = Integer.parseInt(ar[i].trim());
		}
		long[][] change = new long[noOfCoin+1][max+1];
		for(int i= 1;i<=noOfCoin;i++){
			change[i][0] = 1;
			for(int j = 1;j<=max;j++){
				if(j<coins[i-1])
					change[i][j] = change[i-1][j];
				else
					change[i][j] = change[i][j-coins[i-1]]+change[i-1][j];
			}
		}
		System.out.println(change[noOfCoin][max]);
		
		
	}

}
