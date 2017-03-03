package dp.stockMaximize;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCases = Integer.parseInt(br.readLine().trim());
		while(testCases>0){
			int days = Integer.parseInt(br.readLine().trim());
			String str = br.readLine();
			String[] strs = str.split(" ");
			int[] stockPrice = new int[days];
			int[] S = new int[days+1];
			
			for(int i = 0;i<days;i++){
				stockPrice[i]= Integer.parseInt(strs[i].trim());
			}
			BigInteger invested = BigInteger.ZERO;
			BigInteger profit = BigInteger.ZERO;
			for(int i =0;i<days-1;i++){
				boolean buy = false;
				for(int j = i;j<days;j++){
					if(stockPrice[i]< stockPrice[j]){
						buy = true;
						break;
					}		
				}
				if(buy == true){
					S[i+1] = S[i]+1;
					invested = invested.add(BigInteger.valueOf(stockPrice[i]));
					
				}
				else{
					if(stockPrice[i+1]< stockPrice[i]){
						S[i+1] = 0;
						profit = profit.add(BigInteger.valueOf(stockPrice[i]).multiply(BigInteger.valueOf(S[i])));
						
					}
					else
						S[i+1] = S[i];
				}
			}
			profit = profit.add(BigInteger.valueOf(stockPrice[days-1]).multiply(BigInteger.valueOf(S[days-1])));
			
			System.out.println(profit.subtract(invested));
				
			testCases--;
		}
		

	}

}
