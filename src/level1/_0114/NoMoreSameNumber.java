package level1._0114;

//https://programmers.co.kr/learn/courses/30/lessons/12906

import java.util.ArrayList;
import java.util.Arrays;

public class NoMoreSameNumber {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 3, 3, 0, 1, 1, 9})));
    }

    public static int[] solution(int[] arr) {
        int[] answer = {};

        ArrayList<Integer> numbers = new ArrayList<>();
        int sameIndexStart = 0;
        int sameIndexCount = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[sameIndexStart]) {
                sameIndexCount++;
            } else {
                numbers.add(arr[sameIndexStart]);
                sameIndexStart = i;
                sameIndexCount = 0;
            }
            if (i == arr.length - 1) {
                if (sameIndexCount > 0) {
                    numbers.add(arr[sameIndexStart]);
                }
                if (sameIndexCount == 0){
                    numbers.add(arr[sameIndexStart]);
                }
            }
        }

        answer = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            answer[i] = numbers.get(i);
        }

        return answer;
    }
}
