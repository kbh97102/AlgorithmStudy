package _0118;
//https://programmers.co.kr/learn/courses/30/lessons/12954
public class XIntervalN {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        long sum = 0;
        for (int i=0;i<n;i++){
            sum += x;
            answer[i] = sum;
        }

        return answer;
    }
}
