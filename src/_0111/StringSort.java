package _0111;

//https://programmers.co.kr/learn/courses/30/lessons/12915
public class StringSort {

    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        for (int i = 0; i < strings.length; i++) {
            for (int x = 0; x < strings.length - 1 - i; x++) {
                if (strings[x].charAt(n) > strings[x + 1].charAt(n)) {
                    String temp = strings[x];
                    strings[x] = strings[x + 1];
                    strings[x + 1] = temp;
                }
                if (strings[x].charAt(n) == strings[x+1].charAt(n)){
                    int result = strings[x].compareTo(strings[x+1]);
                    if (result  > 0){
                        String temp = strings[x];
                        strings[x] = strings[x + 1];
                        strings[x + 1] = temp;
                    }
                }
            }
        }

        answer = strings.clone();

        return answer;
    }

}
