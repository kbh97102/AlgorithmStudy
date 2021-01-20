package level2._0120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

//https://programmers.co.kr/learn/courses/30/lessons/42583
class TruckInfo{
    int weight;
    int time;

    public TruckInfo(int weight, int time) {
        this.weight = weight;
        this.time = time;
    }
}
public class Truck {
    public static void main(String[] args) {
        System.out.println(solution(2, 10, new int[]{7,4,5,6}));
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        ArrayList<Integer> trucks = Arrays.stream(truck_weights).boxed().collect(Collectors.toCollection(ArrayList::new));
        HashMap<Integer, TruckInfo> truckMap = new HashMap<>();

        int currentWeight = 0;
        int nextTruckWeight = 0;
        while (true) {
            if (trucks.isEmpty() && truckMap.isEmpty()) {
                break;
            }
            ArrayList<Integer> removeTargets = new ArrayList<>();
            for (int key : truckMap.keySet()) {
                //트럭이 지나감
                if (truckMap.get(key).time >= bridge_length) {
                    currentWeight -= truckMap.get(key).weight;
                    removeTargets.add(key);
                }
            }


            for (int key : removeTargets) {
                truckMap.remove(key);
            }
            if (trucks.size() >= 1) {
                nextTruckWeight = trucks.get(0);

                //다리가 무게를 버틸 수 있는 경우 추가
                if (currentWeight + nextTruckWeight <= weight) {
                    TruckInfo info = new TruckInfo(nextTruckWeight, 0);
                    truckMap.put(info.hashCode(), info);
                    trucks.remove((Integer) nextTruckWeight);
                    currentWeight += nextTruckWeight;
                }
            }

            for (int key : truckMap.keySet()) {
                truckMap.get(key).time++;
            }

            answer++;
        }

        return answer;
    }
}
