package level1._0118;

import java.util.Arrays;
import java.util.Collections;

public class SortInt {
    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
    public static long solution(long n) {
        long answer = 0;
        String number = String.valueOf(n);
        String[] arr = number.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        StringBuilder builder = new StringBuilder();
        for (String s : arr){
            builder.append(s);
        }
        return Long.parseLong(builder.toString());
    }
}
