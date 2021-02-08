package level2._0204;

import java.util.Arrays;

public class FindBigSquare {

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0,0,1,1}, {1,1,1,1}}));
    }

    public static int solution(int[][] board) {

        if (board.length <=1 || board[0].length <= 1){
            return 1;
        }

        for (int i=1;i<board.length;i++){
            for (int x = 1;x<board[i].length;x++){
                if (board[i][x] >= 1){
                    int up = board[i-1][x];
                    int left = board[i][x-1];
                    int upLeft = board[i-1][x-1];
                    if (up >= 1 && left >= 1 && upLeft >= 1){
                        int min = Math.min(Math.min(up, left), upLeft);
                        board[i][x] = min+1;
                    }
                }
            }
        }

        int max = 0;
        for (int i=0;i<board.length;i++){
            for (int x = 0;x<board[i].length;x++){
                if (max < board[i][x]){
                    max = board[i][x];
                }
            }
        }

        return max*max;
    }
}
