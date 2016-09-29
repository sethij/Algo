package lazyMayorsAndLasers;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

@SuppressWarnings("unused")
public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] h = new int[n+1];
        h[0] =0;
        for(int i=1;i<=n;i++){
            h[i]= s.nextInt();
        }
        
        int m = s.nextInt();
        int[] l = new int[m];
        for(int i=0;i<m;i++){
            l[i]= s.nextInt();
        }
        
         int end;
        for(int i=0;i<m;i++){
            end = l[i];
              //System.out.println("iteration "+i);            
            for(int j = 1;j<end;j++){
                   int calc= l[i] -j;
                   //System.out.println("Height of"+j+" "+h[j]);
                if(h[j]>calc){
                    //System.out.println("changed to "+h[j]+" calc "+calc);
                    h[j] = calc;  
                }
            }
        }
        BigDecimal sum= new BigDecimal(0);
        for( Integer i:h){
           sum = sum.add(new BigDecimal(i));
           
        }
        System.out.println(sum);
        
        
        
   
        
    }
}

