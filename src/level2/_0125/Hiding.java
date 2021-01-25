package level2._0125;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

//https://programmers.co.kr/learn/courses/30/lessons/42578?language=java
public class Hiding {

    public static void main(String[] args) {
        System.out.println(solution(new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}));
    }

    public static int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> clothesMap = new HashMap<>();

        for (int i=0;i<clothes.length;i++){
            String cloth = clothes[i][0];
            String type = clothes[i][1];
            if (Objects.isNull(clothesMap.get(type))){
                clothesMap.put(type, 1);
                System.out.println("in");
            }else{
                int count = clothesMap.get(type);
                clothesMap.put(type, ++count);
                System.out.println(clothesMap.get(type));
            }
        }

        for (String type : clothesMap.keySet()){
            answer *= (clothesMap.get(type)+1);
        }

        return answer-1;
    }

}
