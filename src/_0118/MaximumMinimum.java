package _0118;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/12940
public class MaximumMinimum {
    public static void main(String[] args) {
    }
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = n * m / answer[0];
        return answer;
    }
    static int gcd(int a, int b) {
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
