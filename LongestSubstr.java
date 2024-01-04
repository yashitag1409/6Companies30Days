import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class LongestSubstr{

    public int longestSubstr(String str){
        int max = 0;
        int len = str.length() - 1;
        int i,j,count;
        char ch;

        

        // ArrayList<String> charArr = new ArrayList<String>();
        // ArrayList<Integer> cA = new ArrayList<Integer>();
        // if((len +1) != 0){
        //     String chStr ="";
        //     for(i = 0;i< len;i++){
        //         count = 0;
        //         ch = str.charAt(i);
        //         chStr+=ch;
        //         for(j = i+1;j< len-1;j++){
        //             char ch2 = str.charAt(j);
        //             if(ch2 == ch){
        //                 break;
        //             }else{
        //                 chStr+=ch2;
        //                 count++;

        //             }
        //         }
        //         charArr.add(chStr);
        //         cA.add(count);
        //     }
        // }else{
        //     return 0;
        // }

        
        // Iterator<String> itr2 = charArr.iterator();
        // while(itr2.hasNext()){
        //     String n = (String)itr2.next();
        //     System.out.println(n);
        // }
        // System.out.println("----------------------------------\n");
        // Iterator<Integer> itr = cA.iterator();
        // while(itr.hasNext()){
        //     Integer n = (Integer)itr.next();
        //     if(n >= max){
        //         max = n;
        //     }
        // } 
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        LongestSubstr ls = new LongestSubstr();
        int res = ls.longestSubstr(str);
        System.out.println(res);


    }
}