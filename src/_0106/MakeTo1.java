package _0106;

import java.util.Arrays;
import java.util.Scanner;

//https://www.acmicpc.net/problem/1463
public class MakeTo1 {

    public void solution(){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] sum =new int[n*3+1];
        Arrays.fill(sum, 1000000);
        sum[1] = 0;
        for (int i=1;i<=n;i++){
            if (sum[i+1] > sum[i]+1){
                sum[i+1] = sum[i]+1;
            }
            if (sum[i*2] > sum[i]+1){
                sum[i*2] = sum[i]+1;
            }
            if (sum[i*3] > sum[i]+1){
                sum[i*3] = sum[i]+1;
            }
        }

        System.out.println(sum[n]);
        /*
        역으로 만들어 올라가는 방법
        곱하고 더하고

         */

        /*

         */
    }
}
