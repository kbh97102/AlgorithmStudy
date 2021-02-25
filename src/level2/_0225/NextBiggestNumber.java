package level2._0225;

public class NextBiggestNumber {

    public static void main(String[] args) {
        System.out.println(solution(15));
    }

    public static int solution(int n) {
        int answer = n;

        int oneCount = 0;
        String binary = Integer.toBinaryString(n);
        for (char c : binary.toCharArray()){
            if (c == '1'){
                oneCount++;
            }
        }
        while(true){
            answer++;
            String nextBinary = Integer.toBinaryString(answer);
            int nextCount = 0;
            for (char c : nextBinary.toCharArray()){
                if (c == '1'){
                    nextCount++;
                }
            }
            if (oneCount == nextCount){
                break;
            }
        }

        return answer;
    }
}
