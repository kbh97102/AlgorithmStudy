package level2._0222;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/42584
public class Stock {

    public static void main(String[] args) {
        solution(new int[]{1,2,3,2,3});
    }

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for(int i=0;i<prices.length;i++){
            int price = prices[i];
            int count = 0;
            for (int x=i+1;x<prices.length;x++){
                count++;
                if (price > prices[x]){
                    break;
                }
            }
            answer[i] = count;
        }

        answer[prices.length-1] = 0;

        return answer;
    }
}
