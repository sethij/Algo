package dp.longestcommonsubsequence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int[][] a = new int[str2.length()+1][str1.length()+1];
		
		for (int i = 1; i <= str2.length(); i++) {
			for(int j = 1; j<=str1.length();j++){
				if(str1.charAt(j-1) == str2.charAt(i-1)){
					a[i][j] = a[i-1][j-1]+1;
				}
				else{
					if(a[i-1][j] >a[i][j-1])
						a[i][j] = a[i-1][j];
					else
						a[i][j] = a[i][j-1];
				}
			}
		}
		System.out.println("Longest common subsequence length is "+ a[str2.length()][str1.length()]);
	}

}
