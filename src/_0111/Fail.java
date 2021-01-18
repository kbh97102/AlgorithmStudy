package _0111;


import java.util.Arrays;
import java.util.Comparator;

//https://programmers.co.kr/learn/courses/30/lessons/42889

class Info {
    int stage;
    double fail;

    public Info(int stage, double fail) {
        this.stage = stage;
        this.fail = fail;
    }
}

public class Fail {

    public int[] solution(int N, int[] stages) {
        int[] answer = {};

        answer = new int[N];


        Info[] infos = new Info[N];

        for (int stage = 1; stage <= N; stage++) {
            int challenger = 0;
            int num = 0;
            for (int i = 0; i < stages.length; i++) {
                if (stage <= stages[i]) {
                    num++;
                }
                if (stage == stages[i]) {
                    challenger++;
                }
            }

            if (challenger <= 0) {
                infos[stage - 1] = new Info(stage, 0.0);
            }
            else if (num <= 0) {
                infos[stage - 1] = new Info(stage, 0.0);
            }else {
                infos[stage - 1] = new Info(stage, (double) challenger / num);

            }
        }

        Arrays.sort(infos, (one, two)->{
            return -Double.compare(one.fail,two.fail);
        });
        for (int i = 0; i < N; i++) {
            answer[i] = infos[i].stage;
        }

        return answer;
    }
}
