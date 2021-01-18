package _0118;
//https://programmers.co.kr/learn/courses/30/lessons/12934
public class IdentifyPow {
    public static void main(String[] args) {
        System.out.println(solution(121));
    }
    public static long solution(long n) {
        long answer = 0;

        for (int i=1;i<=Math.sqrt(n);i++){
            if (Math.pow(i, 2) == n){
                return (long) Math.pow(i+1, 2);
            }
        }

        return -1;
    }
}
