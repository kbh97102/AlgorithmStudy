package _0106;

import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/42897?language=java
public class Casino {
    public int solution(int[] money) {
        int answer = 0;

        //DP문제는 그냥 메모리를 때려박아서 풀면된다 메모라이제이션
        //디바이브 앤 컨커 방법또한 dp문제에서 자주 보인다 이문제는 해당 안됨

        int[] moneySet1 = new int[money.length-1];
        int[] moneySet2 = new int[money.length];

        moneySet1[0] = money[0];
        moneySet1[1] = money[0];
        moneySet2[0] = 0;
        moneySet2[1] = money[1];

        for (int i=2;i<moneySet1.length;i++){
            moneySet1[i] = Math.max(moneySet1[i-2]+money[i],moneySet1[i-1]);
        }
        for (int i= 2;i<moneySet2.length;i++){
            moneySet2[i] = Math.max(moneySet2[i-2]+money[i],moneySet2[i-1] );
        }

        answer = Math.max(moneySet1[moneySet1.length-1],moneySet2[moneySet2.length-1]);

        return answer;
    }

}
