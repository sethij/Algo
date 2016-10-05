package SynchronousShopping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();//no. of shopping center
		int m = s.nextInt();//no.of roads
		int k = s.nextInt();//types of fishes
		HashMap<Integer, ArrayList<Integer>> t  = new HashMap<>();// types fishes sold at shopping center
		for(int i = 0;i<n;i++){
			ArrayList<Integer> ar = new ArrayList<>();
			int no = s.nextInt();
			for(int j= 0;j<no;j++)
				ar.add(s.nextInt());
			t.put(i+1, ar);
		}
		
		s.close();
		
	}

}
