package _0114;

import java.util.ArrayList;
import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/12910
public class DivideIntArray {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        ArrayList<Integer> success = new ArrayList<>();

        for (int i=0;i<arr.length;i++){
            if (arr[i]%divisor == 0){
                success.add(arr[i]);
            }
        }

        if (success.size() <= 0){
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = new int[success.size()];
            for (int i =0;i<success.size();i++){
                answer[i] = success.get(i);
            }
            Arrays.sort(answer);
        }

        return answer;
    }
}
