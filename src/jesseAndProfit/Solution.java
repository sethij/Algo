


package jesseAndProfit;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * <h3>Problem</h3>
<p>
*Jesse has started stock trading and loves it. He knows the prices of a share of a particular company over the next N days.
*He wants to analyze this data to build a model which can predict the best day to buy and sell the shares.
*Given an amount, he wants to know if the given desirable amount of profit can be made.
*If yes, he wants to know the minimum number of days in which it can be made.
*If there are multiple ways of buying and selling to achieve that profit,
*he wants to know the way which happens the earliest.</p>
*<p>
*Note: Jesse can buy only 1 share and not more. He always has to buy before he can sell the share.</p>
*
*<h4>Input Format</h4>
*<p>The first line contains two integers N and D, where N is the number of days for which he knows the share values
*and D is the number of amounts for which he needs the answer.</p>
*
*<p>The next line contains N space separated integers, where N<sub>i</sub> is the value of the share on the (i+1) day.</p>
*
*<p>The next D lines contain a single integer D<sub>i</sub> , where D<sub>i</sub> is the profit that needs to be made.</p>
*
*<h4>Output Format</h4>
*<p>For each amount of profit given as a query, print in a new line containing two space separated integers - 
*the day on which the share was bought and the day on which the share was sold if an answer exists.
*If it is not possible to achieve the amount of profit, print -1.</p>
*
*@author Jagriti
*
**/
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
        ArrayList<String> st = new ArrayList<>();
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
        s.close();  
    }
}