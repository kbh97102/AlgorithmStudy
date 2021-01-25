package level2._0125;
//https://programmers.co.kr/learn/courses/30/lessons/43165
public class TargetNumber {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,1,1,1,1}, 3));
    }

    public static int solution(int[] numbers, int target) {
        int answer = 0;

        answer += dfs(numbers, 1, numbers[0], target);
        answer += dfs(numbers, 1, -numbers[0], target);

        return answer;
    }

    public static int dfs(int[] numbers, int index, int prev, int target){
        if (index == numbers.length){
            if (prev == target){
                return 1;
            }
            return 0;
        }

        int currentPlus = prev + numbers[index];
        int currentMinus = prev - numbers[index];

        int ans = 0;
        index++;
        ans += dfs(numbers, index, currentPlus, target);
        ans += dfs(numbers, index, currentMinus, target);
        return ans;
    }
}
