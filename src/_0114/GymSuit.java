package _0114;

import java.util.ArrayList;
import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/42862
public class GymSuit {

    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{2,4}, new int[]{4}));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        ArrayList<Integer> lostList = new ArrayList<>();
        for (int l : lost){
            lostList.add(l);
        }
        ArrayList<Integer> reserveList = new ArrayList<>();
        for (int r : reserve){
            reserveList.add(r);
        }

        ArrayList<Integer> removeTarget = new ArrayList<>();
        for (int l : lostList){
            if (reserveList.contains(l)){
                reserveList.remove((Integer) l);
                removeTarget.add(l);
            }
        }
        for (int l : removeTarget){
            lostList.remove((Integer) l);
        }

        answer = n-lostList.size();


        for (int lostPerson : lostList){
            int canBefore = lostPerson-1;
            int canAfter = lostPerson+1;
            if (reserveList.contains(canBefore)){
                answer++;
                reserveList.remove((Integer) canBefore);
            }
            else if (reserveList.contains(canAfter)){
                answer++;
                reserveList.remove((Integer) canAfter);
            }
        }

        return answer;
    }
}
