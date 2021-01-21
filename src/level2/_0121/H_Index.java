package level2._0121;

//https://programmers.co.kr/learn/courses/30/lessons/42747

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class H_Index {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 7, 0, 1, 6, 4}));
    }

    public static int solution(int[] numbers) {
        int answer = 0;


        ArrayList<Integer> arr = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(ArrayList::new));

        while (answer < arr.size()) {
            if (arr.get(answer) <= answer) {
                break;
            }
            answer++;
        }


        return answer;
    }

}
