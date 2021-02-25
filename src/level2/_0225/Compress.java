package level2._0225;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//https://programmers.co.kr/learn/courses/30/lessons/17684
public class Compress {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("TOBEORNOTTOBEORTOBEORNOT")));
    }

    public static int[] solution(String msg) {

        HashMap<String, Integer> dictionary = new HashMap<>();
        ArrayList<Integer> answerList = new ArrayList<>();


        char alphabet = 'A';
        for (int i = 0; i <= 25; i++) {
            dictionary.put(String.valueOf(alphabet), i+1);
            alphabet += 1;
        }

        boolean end = false;

        for (int index = 0;index<msg.length();index++){
            String word = String.valueOf(msg.charAt(index));

            while(dictionary.containsKey(word)){
                index++;
                if (index == msg.length()){
                    end = true;
                    break;
                }
                word += String.valueOf(msg.charAt(index));
            }

            if (end){
                answerList.add(dictionary.get(word));
                break;
            }

            answerList.add(dictionary.get(word.substring(0, word.length()-1)));
            dictionary.put(word, dictionary.size()+1);

            index--;
        }

        return answerList.stream().mapToInt(i->i).toArray();
    }

}
