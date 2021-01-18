package _0118;

//https://programmers.co.kr/learn/courses/30/lessons/12943
public class Collatz {
    public static void main(String[] args) {
        System.out.println(solution(6));
    }
    public static int solution(int num) {
        int answer = 0;
        int a = num;

        while(a != 1 && answer != 500){
            if(a % 2 == 0){
                a = a/2;
            } else if(a %2==1){
                a = (a*3) + 1;
            }
            answer++;
        }
        if(answer == 500) {
            answer = -1;
        }

        return answer;
    }
}
