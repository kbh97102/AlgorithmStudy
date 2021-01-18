package level2._0118;
//https://programmers.co.kr/learn/courses/30/lessons/12909
public class CorrectBracket {
    boolean solution(String s) {


        int count=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i) == '('){
                count++;
            }
            if (s.charAt(i) == ')'){
                count--;
            }
            if (count < 0){
                return false;
            }
        }

        return count == 0;
    }
}
