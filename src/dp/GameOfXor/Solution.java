package dp.GameOfXor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int tc = Integer.parseInt(br.readLine().trim());
		while(tc>0){
			int N = Integer.parseInt(br.readLine().trim());
			long[] arr = new long[N];
			String[] strs = br.readLine().split(" ");
			for (int i= 0;i<N;i++ ) {
				arr[i] = Integer.parseInt(strs[i].trim());
			}
		
			long[][] xor = new long[N][N];
			long final_xor = 0;
			for(int i = 0;i<N;i++){
				for(int j= 0;j<N-i;j++){
					int col = i+j;
				
					if(j == col)
						xor[j][col] = arr[j];
					else{
						xor[j][col] = xor[j][col-1] ^ xor[col][col];
					}
					final_xor = final_xor ^ xor[j][col];
				}
			}
			for (long[] ls : xor) {
				System.out.println(Arrays.toString(ls));
			}
			System.out.println("Value for game of XOR is " +final_xor);
			tc--;
		}	
		

	}

}
