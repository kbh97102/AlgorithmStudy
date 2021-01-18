package level1._0114;

import java.util.ArrayList;
import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/42840
class Person{
    public int score;
    public int name;

    public Person(int score, int name) {
        this.score = score;
        this.name = name;
    }
}
public class PracticeTest {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,3,2,4,2})));
    }

    public static int[] solution(int[] answers) {
        int[] answer = {};

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < answers.length; i++) {
            int i1 = i % 5;
            int i2 = i % 8;
            int i3 = i % 10;

            if (answers[i] == arr1[i1]) {
                count1++;
            }
            if (answers[i] == arr2[i2]) {
                count2++;
            }
            if (answers[i] == arr3[i3]) {
                count3++;
            }
        }

        int maxIndex = 0;
        ArrayList<Integer> scores =new ArrayList<>();
        scores.add(count1);
        scores.add(count2);
        scores.add(count3);

        ArrayList<Person> test = new ArrayList<>();
        test.add(new Person(count1, 1));
        test.add(new Person(count2, 2));
        test.add(new Person(count3, 3));

        for (int i=0;i<scores.size();i++){
            if (scores.get(maxIndex) < scores.get(i)){
                maxIndex = i;
            }
        }

        ArrayList<Person> temp = new ArrayList<>();

        for (Person person : test){
            if (person.score == scores.get(maxIndex)){
                temp.add(person);
            }
        }


        answer = new int[temp.size()];
        for (int i=0;i<temp.size();i++){
            answer[i] = temp.get(i).name;
        }

        Arrays.sort(answer);

        return answer;
    }
}
