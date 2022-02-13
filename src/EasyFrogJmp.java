//https://app.codility.com/demo/results/training9QDHKP-XAB/
public class EasyFrogJmp {
    public static void main(String[] args) {
        int X = 10; //시작
        int Y = 85; //목적
        int D = 30; //한번 점프 거리
        int solution = solution(X, Y, D);
        System.out.println("solution = " + solution);
    }
    public static int solution(int X, int Y, int D) {
        int result = 0;

        int target = Y - X;
        result = target/D;
        if(target%D>0) result ++;

        return result;
    }
}
