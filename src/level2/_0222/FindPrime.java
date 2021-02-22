package level2._0222;

import java.util.ArrayList;
import java.util.HashSet;

public class FindPrime {

    public static boolean[] visited;
    public static HashSet<Integer> allNumbers;

    public static void main(String[] args) {
        System.out.println(solution("1532"));
    }

    public static int solution(String numbers){

        allNumbers = new HashSet<>();
        String[] tokens = numbers.split("");
        visited = new boolean[tokens.length];


        for (int i=1;i<=tokens.length;i++){
            String[] result = new String[i];
            dfs(tokens, tokens.length, i, result, 0);
        }

        int answer = 0;

        for (int num : allNumbers){
            if (num >= 2 && isPrime(num)){
                System.out.println(num);
                answer++;
            }
        }

        return answer;
    }

    public static boolean isPrime(int number){
        for (int i=2;i<Math.sqrt(number);i++){
            if (number%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void dfs(String[] arr, int total, int targetAmount, String[] result, int n){
        if (targetAmount == n){
            StringBuilder builder = new StringBuilder();
            for (String s : result){
                builder.append(s);
            }
            allNumbers.add(Integer.parseInt(builder.toString()));
            return;
        }
        for (int i=0;i<total;i++){
            if (!visited[i]){
                visited[i] = true;
                result[n] = arr[i];
                dfs(arr, total, targetAmount, result, n+1);
                visited[i] = false;
            }
        }
    }
}
