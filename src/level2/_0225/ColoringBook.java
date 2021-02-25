package level2._0225;

import java.util.Arrays;
import java.util.Stack;

//https://programmers.co.kr/learn/courses/30/lessons/1829
public class ColoringBook {

    private static int[][] pictures;
    private static boolean[][] visited;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(6, 4, new int[][]{{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}})));
    }

    public static int[] solution(int m, int n, int[][] picture) {
        pictures = picture;
        visited = new boolean[m][n];

        int[] answer = bfs(m, n);

        return answer;
    }

    public static int[] bfs(int m, int n) {
        int[] answer = new int[2];
        Stack<Integer> xStack = new Stack<>();
        Stack<Integer> yStack = new Stack<>();

        for (int i = 0; i < m; i++) {
            for (int z = 0; z < n; z++) {
                int count = 0;
                if (pictures[i][z] > 0 && !visited[i][z]) {
                    inputStack(i, z, xStack, yStack);
                    count++;
                    answer[0]++;
                }
                while (!xStack.isEmpty()) {
                    int x = xStack.pop();
                    int y = yStack.pop();

                    if (x > 0 && pictures[x - 1][y] == pictures[x][y] && !visited[x - 1][y]) {
                        inputStack(x - 1, y, xStack, yStack);
                        count++;
                    }
                    if (y > 0 && pictures[x][y - 1] == pictures[x][y] && !visited[x][y - 1]) {
                        inputStack(x, y - 1, xStack, yStack);
                        count++;
                    }
                    if (x < m - 1 && pictures[x + 1][y] == pictures[x][y] && !visited[x + 1][y]) {
                        inputStack(x + 1, y, xStack, yStack);
                        count++;
                    }
                    if (y < n - 1 && pictures[x][y + 1] == pictures[x][y] && !visited[x][y + 1]) {
                        inputStack(x, y + 1, xStack, yStack);
                        count++;
                    }
                }
                answer[1] = Math.max(count, answer[1]);
            }
        }
        return answer;
    }

    public static void inputStack(int x, int y, Stack<Integer> xStack, Stack<Integer> yStack) {
        xStack.push(x);
        yStack.push(y);
        visited[x][y] = true;
    }
}
