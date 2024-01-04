import java.util.*;

public class LengthEncoding {
    public String encode(String str) {

        StringBuffer sb = new StringBuffer();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            System.out.println(sb.toString());
            if (i > 0 && str.charAt(i) != str.charAt(i - 1)) {
                sb.append(str.charAt(i - 1) + "" + count);
                count = 0;
            }
            count++;
        }
        sb.append(str.charAt(str.length() - 1) + "" + count);
        return sb.toString();
    }

    public static void main(String[] args) {
        LengthEncoding le = new LengthEncoding();
        String str = "aaabbbbbbccdd";
        String res = le.encode(str);
        System.out.println(res);
    }
}
