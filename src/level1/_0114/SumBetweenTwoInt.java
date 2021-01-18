package level1._0114;
//https://programmers.co.kr/learn/courses/30/lessons/12912
public class SumBetweenTwoInt {
    public long solution(int a, int b) {
        long answer = 0;

        if (a == b){
            return a;
        }
        if (a < b){
            for (long z = a;z<=b;z++){
                answer += z;
            }
        }
        else{
            for (long z = b;z<=a;z++){
                answer += z;
            }
        }


        return answer;
    }
}
