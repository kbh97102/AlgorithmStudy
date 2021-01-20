package level2._0118;

import java.util.ArrayList;

//https://programmers.co.kr/learn/courses/30/lessons/42587
class Priority{
    int index;
    int priority;

    public Priority(int index, int priority) {
        this.index = index;
        this.priority = priority;
    }
}
public class Printer {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,1,9,1,1,1}, 0));
    }
    public static int solution(int[] priorities, int location) {
        int answer = 0;


        ArrayList<Priority> arr = new ArrayList<>();

        for (int i=0;i<priorities.length;i++){
            arr.add(new Priority(i, priorities[i]));
        }

        while(!arr.isEmpty()) {
            Priority first = arr.get(0);
            Priority max = arr.get(0);
            arr.remove(0);
            for (Priority p : arr){
                if (max.priority < p.priority){
                    max = p;
                    break;
                }
            }
            //처음에 있는 것 보다 높은 우선순위가 있는 경우

            if (first.priority < max.priority) {
                //맨앞거 삭제하고 맨 뒤로 넘김
                arr.add(first);
            }else{
                answer++;
                if (first.index == location){
                    break;
                }
            }
        }


        return answer;
    }

}
