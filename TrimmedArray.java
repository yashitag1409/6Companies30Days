import java.util.*;

public class TrimmedArray {

    public String trimStr(String st, int to) {
        StringBuffer sb = new StringBuffer();
        char[] ch = st.toCharArray();
        int len = st.length();
        while (to > 0) {
            sb.append(ch[len - to]);
            to--;
        }
        // System.out.println("sb (before rev): " + sb);

        // sb.reverse();
        // System.out.println("sb (after rev): " + sb);
        return sb.toString();
    }

    public int findIdx(String[] nums, int ki, int ti, int len) {
        // int idx = 0;
        String[] trim = new String[len];
        String[] sortedArr = new String[len];

        for (int j = 0; j < len; j++) {
            if (ti == nums[j].length()) {
                trim[j] = nums[j];
                // System.out.println("trim[" + j + "]" + trim[j]);

                sortedArr[j] = nums[j];
                // System.out.println("sortedArr[" + j + "]" + sortedArr[j]);

            } else {
                String str = trimStr(nums[j], ti);
                sortedArr[j] = str;
                trim[j] = str;
            }
        }

        Arrays.sort(sortedArr);
        String val = sortedArr[ki - 1];

        for (int k = 0; k < len; k++) {

            if (trim[k] == val) {
                return k;
            }
        }
        return 0;
    }

    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {

        int[] res = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            // System.out.println("-------------------");
            res[i] = findIdx(nums, queries[i][0], queries[i][1], nums.length);
            // System.out.println("res [" + i + "]" + res[i]);

            // System.out.println("-------------------");
        }

        return res;
    }

    public static void main(String[] args) {
        TrimmedArray ta = new TrimmedArray();

        String[] nums = { "102", "473", "251", "814" };
        int[][] queries = { { 1, 1 }, { 2, 3 }, { 4, 2 }, { 1, 2 } };

        int[] res = ta.smallestTrimmedNumbers(nums, queries);

        for (int i : res)
            System.out.println(i);

    }
}
