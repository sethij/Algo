package dp.vowelPhelia;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		while(testCases>0){
			int len = sc.nextInt();
			String str = sc.next();
			int sum = 0;
			int[][]  ar =new int[len-2][len+1];
			for(int i =0;i<len-2;i++){
				for(int j = i ;j<len;j++){
				
					if(str.charAt(j)== 'a' ||str.charAt(j)== 'e' ||str.charAt(j)== 'i' ||str.charAt(j)== 'o' ||str.charAt(j)== 'u' ){
						ar[i][j+1] = ar[i][j]+1;
					}
					else{
						ar[i][j+1] = ar[i][j];
					}
					if(ar[i][j+1] == 3)
						sum++;
					
				}
			}
			System.out.println(sum);
			testCases--;
		}
		
		sc.close();
	}
	
	
		

}
