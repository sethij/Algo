package stringPermutation;

import java.util.ArrayList;
import java.util.Scanner;

public class PermuteString {
	static ArrayList<String> listed = new ArrayList<String>();
	
	static void swap(int i,int j, char[] arr){
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		String str = String.valueOf(arr);
		if(!listed.contains(str))
			listed.add(str);
	}
	
	static void permute(int start,int N,char[] arr){
		
		for(int i = start;i<N;i++){
			swap(start,i,arr);
			permute(start+1,N,arr);
			swap(start,i,arr);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String st = s.next();
		s.close();
		char[] chr = st.toCharArray();
		permute(0,chr.length,chr);
		for(String tr:listed){
			System.out.println(tr);
		}
		System.out.println(listed.size());
	}

}
