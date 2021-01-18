package level1._0114;

//https://programmers.co.kr/learn/courses/30/lessons/68644

import java.util.ArrayList;
import java.util.Arrays;

public class SelectTwoAndSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5,0,2,7})));
    }

    public static int[] solution(int[] numbers) {
        int[] answer = {};

        ArrayList<Integer> sum = new ArrayList<>();

        for (int i=0;i<numbers.length-1;i++){
            for (int x = i;x<numbers.length-1;x++){
                int result = numbers[i] + numbers[x+1];
                if (!sum.contains(result)){
                    sum.add(result);
                }
            }
        }


        answer = new int[sum.size()];
        for (int i=0;i<sum.size();i++){
            answer[i] = sum.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}
