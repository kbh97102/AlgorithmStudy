package level2._0215;

import java.util.Arrays;
import java.util.Comparator;

public class MakeBiggestNumber_Java {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{6,10,2}));
    }
    public static String solution(int[] numbers) {

        String[] stringNumber = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            stringNumber[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(stringNumber, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return ((o2 + o1).compareTo(o1 + o2));
            }
        });

        if(stringNumber[0].equals("0")) {
            return "0";
        }

        String answer = "";
        for (String a : stringNumber) {
            answer += a;
        }
        return answer;
    }
}
