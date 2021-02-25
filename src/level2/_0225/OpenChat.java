package level2._0225;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class OpenChat {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"})));
    }

    public static String[] solution(String[] record) {
        ArrayList<String> answer = new ArrayList<>();

        HashMap<String, String> userMap = new HashMap<>();

        for (String rec : record){
            String[] recs = rec.split(" ");
            String command = recs[0].trim();
            String userId = recs[1].trim();
            if (recs.length >= 3){
                String userNick = recs[2].trim();
                userMap.put(userId, userNick);
            }

            if (command.equals("Change")){
                userMap.put(userId, recs[2].trim());
            }
        }

        for (String rec : record){
            String[] recs = rec.split(" ");
            String command = recs[0].trim();
            String userId = recs[1].trim();
            StringBuilder builder = new StringBuilder();
            if (command.equals("Enter")){
                builder.append(userMap.get(userId));
                builder.append("님이 들어왔습니다.");
                answer.add(builder.toString());
            }
            else if(command.equals("Leave")){
                builder.append(userMap.get(userId));
                builder.append("님이 나갔습니다.");
                answer.add(builder.toString());
            }
        }

        return answer.stream().toArray(String[]::new);
    }
}
