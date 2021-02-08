package level2._0208;

import java.util.Stack;

//https://programmers.co.kr/learn/courses/30/lessons/12973
public class RemovePair {

    public static void main(String[] args) {
        System.out.println(solution("baabaa"));
    }

    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char current : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(current);
            } else {
                char before = stack.peek();
                if (current == before) {
                    stack.pop();
                } else {
                    stack.push(current);
                }
            }
        }

        return stack.size() == 0 ? 1 : 0;
    }
}
