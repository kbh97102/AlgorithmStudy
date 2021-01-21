package level2._0121;

import java.util.PriorityQueue;

//https://programmers.co.kr/learn/courses/30/lessons/42626
public class Scoville {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            queue.add(scoville[i]);
            if (i != 0 && scoville[i] == 0){
                answer = -1;
                return answer;
            }
        }

        while(true){
            if (queue.size() == 1){
                answer = -1;
                return answer;
            }
            int smallest = queue.poll();
            int next = queue.poll();
            queue.add(smallest+(next*2));
            answer++;
            if (isOk(queue, K)){
                break;
            }
        }

        return answer;
    }
    public static boolean isOk(PriorityQueue<Integer> queue, int K){
        for (int q : queue){
            if (q < K){
                return false;
            }
        }
        return true;
    }
}
