import java.util.*;

public class MaximumScore {

    public static int countZero(char[] ch,int i){
        int left = 0;
        for(int j = 0;j<= i;j++){
            System.out.println("ch[Zero]:" + ch[j]);

            if(ch[j]=='0'){
                left++;}
        }
        return left;
    }
    public static int countOne(char[] ch, int i){
        int right = 0;
        for(int j=i+1;j<=ch.length-1;j++){
            System.out.println("ch[One]:" + ch[j]);
            if(ch[j] == '1'){
                right++;
            }
        }
        return right;
    }

    public static void main(String[] args){

        String str = "011010";
        char[] ch = str.toCharArray();

        int[] score = new int[ch.length-1];

        for(int i= 0;i<ch.length-1;i++){
            int left = countZero(ch, i);
            // System.out.println("left:" +left );            
            // !!!!!!!!!!!!!!!!!!!!!!
            int right = countOne(ch, i);
            // System.out.println("right: " + right);
            
            score[i] = right + left;
            // System.out.println(score[i]);
        }
        Arrays.sort(score);

        System.out.println(score[score.length-1]);


    }
}
