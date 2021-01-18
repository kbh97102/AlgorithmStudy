package _0104;//https://programmers.co.kr/learn/courses/30/lessons/64063?language=java

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class HotelRoom {

    //Linked hash
    //주어진 값 이상이고 가장 작은 수 구하기
    public long[] solution(long k, long[] room_number) {
        long[] answer = new long[room_number.length];
        //방크기는 1 ~ k 이하
        //방번호는 연속된 수가 아닐 수 있음

        //첫 번째 값은 방 번호, 두번 째는 다음 방 번호
        HashMap<Long, Long> hotelRoom = new HashMap<>();

        //고객 희망 요청 방 번호 순회
        for (int i = 0; i < room_number.length; i++) {
            long wantedRoomNumber = room_number[i];
            //원하는 자리보다 크지만 가장 작은 방을 가져옴
            //다음방을 계속 가면서 빈방이 있는지 확인
            ArrayList<Long> path = new ArrayList<>();
            Long nextRoomNumber;
            long currentRoomNumber;
            nextRoomNumber = wantedRoomNumber;
            while (true) {
                currentRoomNumber = nextRoomNumber;
                path.add(currentRoomNumber);
                nextRoomNumber = hotelRoom.get(currentRoomNumber);
                //null 이란건 방이 비어있다는 뜻
                if (nextRoomNumber == null) {
                    answer[i] = currentRoomNumber;
                    for (Long l : path) {
                        hotelRoom.put(l, currentRoomNumber + 1);
                    }
                    break;
                }
                //다음 방이 빈방이 아닌 경우 다음 방으로 넘어감
                nextRoomNumber = hotelRoom.get(currentRoomNumber);
            }
        }


        return answer;
    }

}
