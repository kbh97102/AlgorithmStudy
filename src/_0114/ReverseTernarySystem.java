package _0114;
//https://programmers.co.kr/learn/courses/30/lessons/68935
public class ReverseTernarySystem {

    public static void main(String[] args) {
        System.out.println(solution(45));
    }

    public static int solution(int n) {
        int answer = 0;

        StringBuilder builder = new StringBuilder();
        while(n!=0){
            builder.append(n%3);
            n /=3;
        }
        String reverse = builder.toString();
        System.out.println("Reverse "+reverse);
        for (int i=0;i<reverse.length();i++){
            answer += Character.getNumericValue(reverse.charAt(reverse.length()-i-1))*Math.pow(3, i);
            System.out.println("Result "+answer);
        }

        return answer;
    }

}
