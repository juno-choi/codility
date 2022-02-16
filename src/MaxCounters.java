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
        int[] arr = new int[N];
        int max = 0;

        for(int i : A){
            if(i>N || i<1){
                //최대값들을 더해서 가지고 있음
                Arrays.fill(arr, max);
                continue;
            }
            int su = arr[i-1]++;
            su++;
            if(max < su) max = su;
        }

        return arr;
    }
}
