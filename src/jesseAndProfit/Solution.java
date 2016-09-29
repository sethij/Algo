package jesseAndProfit;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

@SuppressWarnings("unused")
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d = s.nextInt();
        int rates[] = new int[n];
        int profit;
        int least=0;
        int day1=0, day2=0; 
        boolean changed = false;
        ArrayList<String> st = new ArrayList();
        for(int k=0;k<n;k++){
            rates[k] = s.nextInt();
        }
        
        for(int k = 0;k<d;k++){
            profit = s.nextInt();
            for(int j=0;j<n;j++){
                for(int p=j+1;p<n;p++){
                    if(rates[p]-rates[j] == profit){
                        if(least == 0||least > (p-j)){
                        day1 = j+1;
                        day2 = p+1;
                        least = p-j;    
                        changed = true;
                        }
                    }
                }
            }
            if(changed)
                st.add(day1+" "+day2);
            else
                st.add("-1");
            changed = false;
            day1 = day2 = least = 0;
        }
        
        for(String sr:st){
            System.out.println(sr);
        }
        
    }
}