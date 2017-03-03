package dp.q2;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestClass {

public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int testCases = s.nextInt();
		long[] ar = new long[n];
		ArrayList<BigInteger> arr = new ArrayList<>();
		for(int j = 0;j<n;j++){
			//System.out.println("enter digits");
			arr.add(s.nextBigInteger());
		}
	
	
		for(int j= 0;j<n;j++){
		ar[j]=calcDigit(arr.get(j));
	
		}
		
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		for(int i = 0;i<testCases;i++){
			int cs = s.nextInt();
			int x = s.nextInt();
			int sum = 0;
			if(cs == 1){
				int cnt = ar.length-1;
				while(x!=0){
					sum += ar[cnt];
					cnt--;
					x--;
				}
				
			}
			if(cs == 2){
				int cnt = 0;
				while(cnt<x){
					sum += ar[cnt];
					cnt++;
					
				}
			}
			System.out.println(sum);
		}
		s.close();
		
	}

private static long calcDigit(BigInteger bigInteger) {
	long result = 0;
	
	while(!(bigInteger.max(BigInteger.ZERO)).equals(BigInteger.ZERO)){
	
		result += (bigInteger.mod(BigInteger.TEN)).intValue();
		bigInteger = bigInteger.divide(BigInteger.TEN);

	}
	
	if(result>10)
		return(calcDigit(BigInteger.valueOf(result)));
	
	return result;
}

}
