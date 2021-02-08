package level2._0208;

import java.util.ArrayList;
import java.util.Arrays;

public class EndingGame {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})));
    }
    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        answer[0] = 0;
        answer[1] = 0;
        int count = 1;
        ArrayList<String> used = new ArrayList<>();
        used.add(words[0]);
        for (int i=1;i<words.length;i++){
            if (i % n == 0){
                count++;
            }
            String current = words[i];
            String before = words[i-1];
            if (used.contains(words[i])){
                if ((i+1)%n == 0){
                    answer[0] = n;
                }else{
                    answer[0] = (i+1)%n;
                }
                answer[1] = count;
                return answer;
            }
            if (current.charAt(0) != before.charAt(before.length()-1)){
                if ((i+1)%n == 0){
                    answer[0] = n;
                }else{
                    answer[0] = (i+1)%n;
                }
                answer[1] = count;
                return answer;
            }else{
                used.add(current);
            }
        }

        return answer;
    }
}
