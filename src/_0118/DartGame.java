package _0118;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/17682
public class DartGame {
    public static void main(String[] args) {
        System.out.println(solution("1D2S#10S"));
    }
    public static int solution(String dartResult) {

        String num = "";
        int[] result = new int[3];
        int index = 0;
        Arrays.fill(result, -1);
        for (int i=0;i<dartResult.length();i++){
            char c = dartResult.charAt(i);
            if (Character.isDigit(c)) {
                num += String.valueOf(c);
            }
            else if (c == 'S' || c == 'D' || c == 'T'){
                int number = Integer.parseInt(num);
                if (c == 'D'){
                    number = (int) Math.pow(number, 2);
                }
                else if (c == 'T'){
                    number = (int) Math.pow(number, 3);
                }
                result[index++] = number;
                num = "";
            }
            else{
                if (c == '*'){
                    result[index-1] *= 2;
                    if (index-2 >= 0){
                        result[index-2] *= 2;
                    }
                }
                else{
                    int current = result[index-1];
                    result[index-1] = current*-1;
                }
            }
        }
        System.out.println(Arrays.toString(result));
        return Arrays.stream(result).sum();
    }
}
