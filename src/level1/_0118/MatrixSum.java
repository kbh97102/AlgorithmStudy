package level1._0118;
//https://programmers.co.kr/learn/courses/30/lessons/12950
public class MatrixSum {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i=0;i<arr1.length;i++){
            for (int x = 0;x<arr1[i].length;x++){
                answer[i][x] = arr1[i][x] + arr2[i][x];
            }
        }
        return answer;
    }
}
