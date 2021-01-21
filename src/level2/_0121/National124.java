package level2._0121;
//https://programmers.co.kr/learn/courses/30/lessons/12899
public class National124 {

    public static void main(String[] args) {
        System.out.println(solution(5));
    }

    public  static  String solution(int n) {
        StringBuilder answer = new StringBuilder();

        int[] nums = new int[]{4,1,2};

        while(n > 0){
            int index = n%3;
            n /= 3;
            if (index == 0){
                n--;
            }
            answer.insert(0, nums[index]);
        }

        return answer.toString();
    }
}
