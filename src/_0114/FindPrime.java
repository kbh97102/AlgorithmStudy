package _0114;
//https://programmers.co.kr/learn/courses/30/lessons/12921
public class FindPrime {

    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static int solution(int n) {
        int answer = 0;
        boolean[] prime =new boolean [n+1];

        for(int i=2; i<=n ; i++)
            prime[i]=true;
        int root=(int)Math.sqrt(n);

        for(int i=2; i<=root; i++){
            if(prime[i]){
                for(int j=i; i*j<=n; j++)
                    prime[i*j]=false;
            }
        }
        for(int i =2; i<=n; i++)  {
            if(prime[i])
                answer++;
        }
        return answer;
    }
}
