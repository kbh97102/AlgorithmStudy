package kakaoBlindRecruitment2021.level1;

public class RecommendNewId {
    public static void main(String[] args) {
        System.out.println(solution("abcdefghijklmn.p"));
    }
    public static String solution(String new_id) {
        String answer = "";

        //1단계
        answer = new_id.toLowerCase();
        //2단계
        StringBuilder builder = new StringBuilder();
        for (int i=0;i<answer.length();i++){
            char c = answer.charAt(i);
            if (Character.isLowerCase(c) || Character.isDigit(c) || c == '-' || c == '_' || c == '.'){
                builder.append(c);
            }
        }
        answer = builder.toString();
        //3단계
        for (int i=0;i<answer.length()-1;i++){
            int x = i+1;
            String dot = ".";
            if (answer.charAt(i) == '.'){
                while(x < answer.length() && answer.charAt(x) == '.'){
                    dot += ".";
                    x++;
                }
                if (dot.length()>1){
                    answer = answer.replace(dot, ".");
                }
            }
        }
        //4단계
        builder = new StringBuilder(answer);
        if (answer.charAt(0) == '.'){
            builder.deleteCharAt(0);
        }
        answer = builder.toString();
        if (answer.length() > 0 && answer.charAt(answer.length()-1) == '.'){
            builder.deleteCharAt(answer.length()-1);
        }
        answer = builder.toString();
        //5단계
        if (answer.length() == 0){
            answer = "a";
        }
        //6단계
        if (answer.length() >= 16){
            builder.delete(15, answer.length());
            answer = builder.toString();
            if (answer.charAt(answer.length()-1) == '.'){
                builder.deleteCharAt(answer.length()-1);
            }
            if (answer.charAt(0) == '.'){
                builder.deleteCharAt(0);
            }
            answer = builder.toString();
        }
        //7단계
        builder = new StringBuilder(answer);
        while (answer.length() <= 2){
            builder.append(answer.charAt(answer.length()-1));
            answer = builder.toString();
        }

        return answer;
    }
}
