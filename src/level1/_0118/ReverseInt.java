package level1._0118;
//https://programmers.co.kr/learn/courses/30/lessons/12932
public class ReverseInt {
    public int[] solution(long n) {
        String tempStr = new String(n+"");
        char[] tempChar = tempStr.toCharArray();
        int[] answer=new int[tempChar.length];
        for(int i =0; i<tempChar.length; i++){
            answer[i] = Integer.parseInt(tempChar[tempChar.length-1-i]+"");
        }
        return answer;
    }
}
