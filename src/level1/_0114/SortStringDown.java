package level1._0114;

import java.util.Collections;

public class SortStringDown {
    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }

    public static String solution(String s) {
        return s.chars().boxed().sorted(Collections.reverseOrder()).collect(StringBuilder::new,StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}
