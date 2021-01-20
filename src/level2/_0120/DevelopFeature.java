package level2._0120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

//https://programmers.co.kr/learn/courses/30/lessons/42586
public class DevelopFeature {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1})));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] finish = new int[progresses.length];

        while (true) {
            for (int i = 0; i < progresses.length; i++) {
                if (progresses[i] < 100) {
                    finish[i]++;
                    progresses[i] += speeds[i];
                }
            }
            if (isComplete(progresses)) {
                break;
            }
        }

        ArrayList<Integer> dDay = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = finish.length - 1; i >= 0; i--) {
            stack.push(finish[i]);
        }

        int currentDDay;
        while (!stack.isEmpty()) {

            currentDDay = stack.pop();
            int count = 1;
            int nextDDay;
            if (stack.size() >= 1) {
                nextDDay = stack.peek();

                while (true) {
                    //같이 출고 할 수 있는 경우
                    if (currentDDay >= nextDDay) {
                        count++;
                        stack.pop();
                        if (!stack.isEmpty()) {
                            nextDDay = stack.peek();
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            dDay.add(count);
        }

        return dDay.stream().mapToInt(i -> i).toArray();
    }

    public static boolean isComplete(int[] progresses) {
        for (int i = 0; i < progresses.length; i++) {
            if (progresses[i] < 100) {
                return false;
            }
        }
        return true;
    }
}
