import java.util.ArrayList;

public class MinimizeSet {
    public static boolean checkDivisble(int num , int div){
        return num % div == 0;
    }
    public static int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        int max = 0;
        int num = 1;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(uniqueCnt1 > 0){

            if(!checkDivisble(num, divisor1)){
                arr.add(num);
                max = Math.max(max,num);
            }
            
            num = num+2;
            uniqueCnt1--;
        }
        num = 2;
        System.out.println("--------------------------");

        while(uniqueCnt2 > 0){
            if(arr.contains(num)){
                num++;
            }
            if(!checkDivisble(num, divisor2))
                max = Math.max(max,num);
            
            num = num +2;
            uniqueCnt2--;
        }
        return max;
    }
    public static void main(String[] args) {
        int divisor1 = 3;
        int divisor2 = 5;
        int uniqueCnt1 = 2; 
        int uniqueCnt2 = 1;
        // System.out.println(1%2);
        System.out.println("!!!!!!!!!!!!!!!!1");


        int max= minimizeSet(divisor1,divisor2,uniqueCnt1,uniqueCnt2);
        System.out.println(max);

    }
}
