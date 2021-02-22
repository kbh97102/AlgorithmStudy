package level2._0222;

//https://programmers.co.kr/learn/courses/30/lessons/12980
public class JumpAndTeleport {

    public static void main(String[] args) {
        System.out.println(solution(6));
    }

    public static int solution(int n) {
        int ans = 0;

        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                ans++;
                n--;
            }
        }

        return ans;
    }

}
