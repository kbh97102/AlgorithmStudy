package level2._0219;
//https://programmers.co.kr/learn/courses/30/lessons/12985
public class PredictionDraw {
    public int solution(int n, int a, int b)
    {
        int answer = 1;

        int small, big;
        if (a > b){
            small = b;
            big = a;
        }else{
            small = a;
            big = b;
        }

        while(true){
            if (big-small == 1 && small % 2 != 0){
                break;
            }
            small = (small+1)/2;
            big = (big+1)/2;
            answer++;
        }

        return answer;
    }



}
