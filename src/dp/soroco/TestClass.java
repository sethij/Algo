package dp.soroco;

import java.util.ArrayList;
import java.util.Scanner;

public class TestClass {
	
	

	public TestClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int testCases = s.nextInt();
		for(int i = 0;i<testCases;i++){
			int len = s.nextInt();
			
			ArrayList<Integer> arr = new ArrayList<>();
			for(int j = 0;j<len;j++){
				arr.add(s.nextInt());
			}
			System.out.println(calcOpt(arr));
		}
		s.close();
		
	}

	private static int calcOpt(ArrayList<Integer> arr) {
		
		for (int i = 0;i<arr.size();i++) {
			int pow = powerOfTwo(arr.get(i)); 
			if(pow!=0){
				arr.set(i, 0);
				if(pow+i<arr.size()){
					arr.set(pow+i, arr.get(pow+i)+1);
				}
				else{
					int diff = pow+1 -arr.size(); 
					for(int p = 0;p<= diff;p++){
						arr.add(0);
					}
					arr.set(pow+i,arr.get(pow+i)+1);
					
				}
			}
		}
		
		int count = 0;
		for (Integer itr : arr) {
			count+= itr;
		}
	return count;
		
	}
	
	private static int powerOfTwo(int x){
		int count=0;
		int y = x;
		while(x>0 && x%2 ==0){
			x = x/2;
			++count;
		}
		
		if((y &(y-1))==0){
			return count;
			}
		else
			return 0;
		}
	
	

}
