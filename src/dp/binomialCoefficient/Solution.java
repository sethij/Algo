package dp.binomialCoefficient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String ar[] = str.split(" ");
		int n = Integer.parseInt(ar[0].trim());
		int k = Integer.parseInt(ar[1].trim());
		int[][] arr = new int[k+1][n];
		for (int i = 0; i <=k; i++) {
			for (int j = 0; j < n; j++) {
				if(j+1 == i || i == 0 ) // j+1 bcoz j is starting from 0 and n's value should start from 1
					arr[i][j]=1;
				else if(j+1 < i)
					arr[i][j]=0;
				else
					arr[i][j] = arr[i-1][j-1]+arr[i][j-1];
				
					
			}
			
		}
		/*for (int[] is : arr) {
			System.out.println(Arrays.toString(is));
		}*/
		System.out.println("Bionomial coefficient of (1+x)^n for("+n+","+k+") is: "+arr[k][n-1]);
	}

}
