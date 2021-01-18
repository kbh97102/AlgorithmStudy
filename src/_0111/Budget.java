package _0111;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

//https://programmers.co.kr/learn/courses/30/lessons/12982
public class Budget {

    public int solution(int[] d, int budget) {
        int answer = 0;

        ArrayList<Integer> test = new ArrayList<>();
        IntStream stream = Arrays.stream(d);
        stream.sorted().forEach(test::add);

        for (int c : test){
            budget -= c;
            if (budget >=0){
                answer++;
            }
        }

        return answer;
    }
}
