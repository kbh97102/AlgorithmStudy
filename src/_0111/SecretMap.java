package _0111;

public class SecretMap {


    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};

        answer = new String[n];

        for (int i=0;i<n;i++){
            StringBuilder builder = new StringBuilder();
            String a1 = generate(Integer.toBinaryString(arr1[i]), n);
            String a2 = generate(Integer.toBinaryString(arr2[i]), n);

            for (int c = 0;c<a1.length();c++){
                if (a1.charAt(c) == '1' || a2.charAt(c) == '1'){
                    builder.append("#");
                }
                if (a1.charAt(c) == '0' && a2.charAt(c) == '0'){
                    builder.append(" ");
                }
            }
            answer[i] = builder.toString();
        }

        return answer;
    }

    public String generate(String a, int n){
        StringBuilder builder = new StringBuilder();
        for (int i=0;i<n-a.length();i++){
            builder.append("0");
        }
        builder.append(a);
        return builder.toString();
    }
}
