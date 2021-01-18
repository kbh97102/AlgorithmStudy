package level1._0114;

//https://programmers.co.kr/learn/courses/30/lessons/12922
public class WaterMellon {
    public static void main(String[] args) {
        System.out.println(solution(4));
    }
    public static String solution(int n) {
        String answer = "";

        StringBuilder builder = new StringBuilder();
        answer = "수박".repeat(n/2);

        if (n%2 > 0){
            answer+="수";
        }

        return answer;
    }
}
