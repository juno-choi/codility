
//
public class CountDiv {
    public static void main(String[] args) {
        int A = 0;
        int B = 14;
        int K = 2;
        int solution = solution(A, B, K);
        System.out.println("solution = " + solution);
    }
    public static int solution(int A, int B, int K) {
        if(A%K==0) return B/K - A/K +1;
        return B/K - A/K;
    }
}
