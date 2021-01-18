package _0106;

//https://www.acmicpc.net/problem/1149

import java.util.Scanner;

public class RGBStreet {

    public int solution(int n) {
        Scanner scanner = new Scanner(System.in);
        int numberOfHouse = scanner.nextInt();
        int[] costs = new int[numberOfHouse * 3];
        for (int i = 0; i < costs.length; i++) {
            costs[i] = scanner.nextInt();
        }
        int[] prevSum = new int[3];
        int[] current = new int[3];
        for (int i=0;i<numberOfHouse;i++){
            current[0] = costs[i*3] + Math.min(prevSum[1], prevSum[2]);
            current[1] = costs[i*3+1] + Math.min(prevSum[0], prevSum[2]);
            current[2] = costs[i*3+2] + Math.min(prevSum[0], prevSum[1]);
            prevSum[0] = current[0];
            prevSum[1] = current[1];
            prevSum[2] = current[2];
        }

        int answer = Math.min(Math.min(prevSum[0], prevSum[1]), prevSum[2]);

        System.out.println(answer);

        return answer;
    }
}
