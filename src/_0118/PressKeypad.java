package _0118;

//https://programmers.co.kr/learn/courses/30/lessons/67256
public class PressKeypad {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,3,4,5,8,2,1,4,5,9,5}, "right"));
    }
/*
2차원 배열로 키패드를 만들고 품
 */
    public static String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int leftPosition = 0;
        int rightPosition = 0;

        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                sb.append("L");
                leftPosition = number;
            } else if (number == 3 || number == 6 || number == 9) {
                sb.append("R");
                rightPosition = number;
            } else {
                int leftLength = getCount(leftPosition, number);
                int rightLength = getCount(rightPosition, number);

                if (leftLength > rightLength) {
                    sb.append("R");
                    rightPosition = number;
                } else if (leftLength < rightLength) {
                    sb.append("L");
                    leftPosition = number;
                } else {
                    if (hand.equals("right")) {
                        sb.append("R");
                        rightPosition = number;
                    } else {
                        sb.append("L");
                        leftPosition = number;
                    }
                }
            }
        }
        return sb.toString();
    }

    public static int getCount(int index, int number) {
        if (index == 0) {
            index = 11;
        }
        if (number == 0) {
            number = 11;
        }

        int x = (index - 1) / 3;
        int y = (index - 1) % 3;
        int numberX = number / 3;
        int numberY = 1;

        return Math.abs(x - numberX) + Math.abs(y - numberY);
    }
}
