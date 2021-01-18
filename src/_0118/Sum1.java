package _0118;
//https://programmers.co.kr/learn/courses/30/lessons/12931
public class Sum1 {

    public static void main(String[] args) {
        System.out.println(solution(987));
    }
    public static int solution(int n) {
        int answer = 0;
        while(n != 0){
            answer += n%10;
            n /=10;
        }
        return answer;
    }
}
