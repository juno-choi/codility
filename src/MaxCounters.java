import java.util.Arrays;

//
public class MaxCounters {
    public static void main(String[] args) {
        int N = 5;
        int[] A = {3,4,4,6,1,4,4};
        int[] solution = solution(N, A);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }

    public static int[] solution(int N, int[] A) {
        int[] result = new int[N];
        int tempNum = 0;
        int maxNum = 0;

        for(int i=0; i<A.length; i++){
            if(A[i]>N){
                maxNum = tempNum;
                continue;
            }

            if(result[A[i]-1] < maxNum) result[A[i]-1] = maxNum;

            result[A[i]-1]++;

            if(result[A[i]-1]>tempNum) tempNum = result[A[i]-1];
        }


        for(int i=0; i<N; i++){
            if(result[i]<maxNum) result[i] = maxNum;
        }

        return result;
    }
}
