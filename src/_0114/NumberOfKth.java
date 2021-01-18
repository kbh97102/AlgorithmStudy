package _0114;

//https://programmers.co.kr/learn/courses/30/lessons/42748

import java.util.Arrays;

public class NumberOfKth {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];

        for (int x=0;x< commands.length;x++){
            int i = commands[x][0];
            int j = commands[x][1];
            int k = commands[x][2];
            int[] temp = new int[j-i+1];
            int index=0;
            for (int z = i-1;z<j;z++){
                temp[index++] = array[z];
            }
            Arrays.sort(temp);
            answer[x] = temp[k-1];
        }


        return answer;
    }
}
