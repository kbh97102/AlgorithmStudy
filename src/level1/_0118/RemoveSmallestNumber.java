package level1._0118;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/12935
public class RemoveSmallestNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{10})));
    }
    public static int[] solution(int[] arr) {
        if (arr.length <= 1)
            return new int[]{ -1 };
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}
