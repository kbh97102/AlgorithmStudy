package kakaoBlindRecruitment2021.level2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MenuRenewal {

    static HashMap<String, Integer> perms = new HashMap<>();
    static int count1 = 0;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"}, new int[]{2, 3, 4})));
    }

    public static String[] solution(String[] orders, int[] course) {
        String[] answer = {};

        for (int courseSize : course){
            for (String order : orders){
                StringBuilder builder = new StringBuilder();
                if (courseSize <= order.length()){
                    dfs(order, builder, 0, 0, courseSize);
                }
            }
        }

        return answer;
    }

    public static boolean isOk(String order, String menu){
        for (int i = 0;i<menu.length();i++){
            if (!order.contains(String.valueOf(menu.charAt(i)))){
                return false;
            }
        }
        return true;
    }

    public static void dfs(String input, StringBuilder builder, int idx, int n, int targetLength){
        System.out.println("dfs in "+idx);
        if (idx == targetLength){
            perms.put(builder.toString(), perms.getOrDefault(builder.toString(),0)+1);
            return;
        }
        for (int i=idx;i<input.length();i++){
            builder.append(input.charAt(i));
            System.out.println("append "+input.charAt(i)+" builder "+builder.toString()+ " idx "+idx+" i "+i+" n "+n);
            dfs(input, builder, idx+1, n+1, targetLength);
            builder.delete(n, n+1);
            System.out.println("delete n "+n+" i "+ i +" builder "+builder.toString());
            System.out.println(count1++);
        }
    }
}
