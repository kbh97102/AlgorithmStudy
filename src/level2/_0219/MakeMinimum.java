package level2._0219;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/12941?language=java
public class MakeMinimum {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2}, new int[]{3, 4}));
    }

    public static int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[A.length - i - 1];
        }

        return answer;
    }

}
