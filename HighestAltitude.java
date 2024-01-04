public class HighestAltitude {
    public static void main(String[] args){
        int[] gain = {-5,1,5,0,-7};
        int len = gain.length;
        int max = 0;
        int val = 0;
        for(int i = 0;i< len;i++){
            val +=gain[i];
            if(max<val){
                max = val;
            }
        }

        System.out.println(max);
    }
}
