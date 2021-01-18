package _0114;

import java.util.stream.IntStream;

public class FindKimInSeoul {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"Jane", "Kim"}));
    }
    public static String solution(String[] seoul) {
        return "김서방은 " + IntStream.range(0, seoul.length).filter(index -> seoul[index].equals("Kim")).findFirst().getAsInt() + "에 있다";
    }
}
