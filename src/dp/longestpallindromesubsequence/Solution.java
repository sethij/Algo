package dp.longestpallindromesubsequence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[][] a = new int[str.length()][str.length()];
		for (int i = 0; i <str.length(); i++) {
			for (int j = 0; j < str.length()-i; j++) {
				if(j == (i+j))
					a[j][j+i] = 1;
				else if(str.charAt(j) == str.charAt(j+i))
					a[j][j+i]=a[j+1][j+i-1]+2;
				else{
					if(a[j][j+i-1]>a[j+1][j+i])
						a[j][j+i] = a[j][j+i-1];
					else 
						a[j][j+i] = a[j+1][j+i];
				}
			}
		}
	for (int[] is : a) {
		System.out.println(Arrays.toString(is));
	}	
	System.out.println("LPS : "+a[0][str.length()-1]);
	}


}
