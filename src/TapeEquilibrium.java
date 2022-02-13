//https://app.codility.com/demo/results/trainingRMEFC5-9QB/
public class TapeEquilibrium {
    public static void main(String[] args) {
        //int[] A = {-1000,1000};
        int[] A = {-10, -20, -30, -40, 100};
        int solution = solution(A);
        System.out.println("solution = " + solution);
    }
    public static int solution(int[] A) {

        int result = Integer.MAX_VALUE;
        int length = A.length;
        int[] arr1 = new int[length-1];
        int su1 = 0;
        int su2 = 0;
        for(int i=0; i<length-1; i++){
            int su = A[i];
            su1 += su;
            arr1[i] = su1;
        }
        for(int i=0; i<length-1; i++){
            int su = A[i];
            if(i>0)su1 -= su;
            su2 += su;
            int su3 = Math.abs(su1 - su2);
            result = Math.min(su3, result);
        }

        return result;
    }
}
