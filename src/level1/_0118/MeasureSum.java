package level1._0118;
//https://programmers.co.kr/learn/courses/30/lessons/12928
public class MeasureSum {
    public int solution(int n) {
        int answer = 0;
        for (int i=1;i<=n;i++){
            if (n%i == 0){
                answer += i;
            }
        }
        return answer;
    }
}
