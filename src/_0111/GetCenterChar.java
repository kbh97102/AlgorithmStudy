package _0111;

//https://programmers.co.kr/learn/courses/30/lessons/12903
public class GetCenterChar {
    public String solution(String s) {
        String answer = "";


/*
4  13
(4-1)/2 (4/2)
5 23
(5-1)/2 5/2 ceil
 */
        return s.substring((s.length()-1)/2, (s.length()+2)/2);
    }
}
