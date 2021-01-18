package _0114;

//https://programmers.co.kr/learn/courses/30/lessons/12916
public class NumberOfPAndY {
    boolean solution(String s) {
        s = s.toUpperCase();
        return s.chars().filter(a -> (char)a == 'P').count() == s.chars().filter(a -> (char)a == 'Y').count();
    }

}
