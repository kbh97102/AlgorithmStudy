package _0118;
//https://programmers.co.kr/learn/courses/30/lessons/12948
public class HidePhoneNumber {

    public String solution(String phone_number) {
        StringBuilder builder = new StringBuilder();
        for (int i=0;i<=phone_number.length()-5;i++){
            builder.append("*");
        }
        for (int i = phone_number.length()-4;i<phone_number.length();i++){
            builder.append(phone_number.charAt(i));
        }

        return builder.toString();
    }

}
