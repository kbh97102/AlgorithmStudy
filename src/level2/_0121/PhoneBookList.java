package level2._0121;
//https://programmers.co.kr/learn/courses/30/lessons/42577
public class PhoneBookList {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"123", "456", "789"}));
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        for (String phoneNumber : phone_book){
            for (int i = 0; i < phone_book.length; i++) {
                if (!phoneNumber.equals(phone_book[i]) && phoneNumber.length() <= phone_book[i].length()){
                    String front = phone_book[i].substring(0, phoneNumber.length());
                    if (front.equals(phoneNumber)){
                        return false;
                    }
                }
            }
        }

        return answer;
    }

}
