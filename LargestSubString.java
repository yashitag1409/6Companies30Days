import java.util.*;

public class LargestSubString {
    public static int maxLengthBetweenEqualCharacters(String s){
        int len = s.length(),ans=-1;
        for(int i = 0;i< len;i++){
            for(int j = len-1;j>i;j--)
            if (s.charAt(i) == s.charAt(j)) 
                ans = Math.max(ans,(j-i)-1);
            
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "mgntdygtxrvxjnwksqhxuxtrv";
        // System.out.println(str.length());

        int res = maxLengthBetweenEqualCharacters(str);

        System.out.println(res);
    }
}
