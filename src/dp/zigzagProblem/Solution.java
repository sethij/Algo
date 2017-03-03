package dp.zigzagProblem;

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
		
		System.out.println("Longest zigzag "+calcZP(arr)); 
		
	
		s.close();
	}

	private static int calcZP(int[] arr) {
		int[] pos,neg;
		pos = new int[arr.length];
		neg = new int[arr.length];
		Arrays.fill(pos, 1);
		Arrays.fill(neg, 1);
		
		for(int i= 1; i<arr.length;i++){
			for(int j = 0;j<i;j++){
				
				if(arr[i]>arr[j]){
					if(pos[i]<neg[j]+1)
						pos[i] = neg[j]+1;
				}
				else if(arr[i]<arr[j]){
					if(neg[i] < pos[j]+1)
						neg[i] = pos[j]+1;
				}
			//	System.out.println("i "+i+" j "+j);
				//System.out.println("pos "+Arrays.toString(pos) );
				//System.out.println("neg "+Arrays.toString(neg) );
			}
			
		}
		
		int max = 0;
		for(int i = 0;i<pos.length;i++){
			if(neg[i] > max)
				max = neg[i];
			if(pos[i]>max)
				max = pos[i];
		}
		return max;
	}

}
