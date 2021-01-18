package _0114;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//https://programmers.co.kr/learn/courses/30/lessons/12901
public class Year2016 {
    public static void main(String[] args) {
        System.out.println(solution(5,24));
    }
    public static String solution(int a, int b) {
        String answer="";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        try {
            StringBuilder builder = new StringBuilder();
            builder.append(b);
            builder.append("/");
            builder.append(a);
            builder.append("/2016");
            Date myDate = sdf.parse(builder.toString());
            sdf.applyPattern("EEE");
            answer = sdf.format(myDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return answer.toUpperCase();
    }
}
