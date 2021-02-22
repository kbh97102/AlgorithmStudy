package level2._0222;

import java.math.BigInteger;

//https://programmers.co.kr/learn/courses/30/lessons/17686
public class GoodSquare {

    public long solution(int w, int h) {
        long answer = 0;

        int gcd = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue();
        return ((long) w * (long) h) - ((((long) w / gcd) + ((long) h / gcd) - 1) * gcd);
    }

}
