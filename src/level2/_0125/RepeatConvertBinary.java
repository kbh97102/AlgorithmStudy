package level2._0125;

import java.util.ArrayList;
import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/70129
public class RepeatConvertBinary {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("1111111")));
    }

    public static int[] solution(String s) {
        int[] answer = new int[2];

        ArrayList<Integer> zero = new ArrayList<>();

        while(!s.equals("1")){
            StringBuilder builder = new StringBuilder();
            int count = 0;
            for (int i=0;i<s.length();i++){
                char current = s.charAt(i);
                if (current == '0'){
                    count++;
                }else{
                    builder.append(current);
                }
            }
            System.out.println("Count "+count+" String "+builder.toString());
            zero.add(count);
            int size = builder.toString().length();
            s = Integer.toBinaryString(size);
        }

        answer[0] = zero.size();
        answer[1] = 0;
        for (Integer integer : zero) {
            answer[1] += integer;
        }

        return answer;
    }
}
