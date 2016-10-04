package hammingDistance;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        StringBuilder S ;
        int N, M, i;
         int l,r,l1,r1,l2,r2;
        String query = new String(); 
        //String splitted_query[];
        ArrayList<Object> output  = new ArrayList<Object>();
        Scanner sc = new Scanner(System.in);
        // length of string
        N  = sc.nextInt();
        // String and processing
        S= new StringBuilder(sc.next());
       // System.out.println(S);
        int len =  S.length();
        if(len > N)
        S.delete(N,len-1);
        //no of queries
        M = sc.nextInt();
       // sc.nextLine();
        for(i=0;i<M;i++){
        	if(sc.hasNext()){
            query = sc.next();
            System.out.println("query "+ query);
            switch(query){
                case "C":{
                            l = sc.nextInt();
                            System.out.println("in C 1 "+l);
                            r = sc.nextInt();
                            System.out.println("in C 2 "+r);
                            String charac = sc.next();
                            System.out.println("in C 3"+charac);
                            String newStr = new String(new char[r-l+1]).replace('\0', charac.charAt(0)); 
                           S.replace(l-1,r,newStr);
                break;
                }
                case "S":{
                     
                        l1 = sc.nextInt();
                        System.out.println("in S "+l1);
                        r1 = sc.nextInt();
                        System.out.println("in S "+r1);
                        l2 = sc.nextInt();
                        System.out.println("in S "+l2);
                        r2 = sc.nextInt();
                        System.out.println("in S "+r2);
                        String s1 = S.substring(l1-1,r1);
                        String s2 = S.substring(l2-1,r2);
                        S.replace(l2-1,r2,s1);
                        S.replace(l1-1,r1,s2);
                break;
                }
                case "R":{
                         l = sc.nextInt();
                         System.out.println("in R "+l);
                         r = sc.nextInt();
                         System.out.println("in R "+r);
                         StringBuilder s1 = new StringBuilder(S.substring(l-1,r)).reverse();
                         S.replace(l-1,r,s1.toString());
                      break;
                }
                case "W":{
                            l = sc.nextInt();
                            System.out.println("in W "+l);
                            r = sc.nextInt();
                            System.out.println("W "+r);
                            output.add(S.substring(l-1,r));
                   break;
                }
                case "H":{
                     
                        l1 = sc.nextInt();
                        System.out.println("in H "+l1);
                        l2 = sc.nextInt();
                        System.out.println("in H "+l2);
                        l = sc.nextInt();
                        System.out.println("in H "+l);
                        String s1 = S.substring(l1-1,l1-1+l);
                        String s2 = S.substring(l2-1,l2-1+l);
                        int hd=0;
                        for(int j=0;j<l;j++)
                            {
                            if(s1.charAt(j) != s2.charAt(j))
                                hd++;
                        }
                        output.add(hd);
                 break;
                }
                default:{
                    System.out.println("Invalid input");
                    break;
                }
                
            }
        }
        }
        for(Object o: output){
            System.out.println(o.toString());           
        }
        sc.close();    
    }
}