package level1._0118;
//https://programmers.co.kr/learn/courses/30/lessons/12947
public class HashadNumber {
    public boolean solution(int x) {
        int sum = 0;
        int n = x;
        while(n != 0){
            sum += n%10;
            n/=10;
        }
        if (x%sum == 0){
            return true;
        }else{
            return false;
        }
    }
}
