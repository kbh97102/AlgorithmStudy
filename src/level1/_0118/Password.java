package level1._0118;
//https://programmers.co.kr/learn/courses/30/lessons/12926
public class Password {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch + n);
                if (ch > 'z')
                    ch -= 26;
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + n);
                if (ch > 'Z')
                    ch -= 26;
            }

            sb.append(ch);
        }

        return sb.toString();
    }
}
