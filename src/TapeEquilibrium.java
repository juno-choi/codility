import java.util.Stack;

//https://app.codility.com/demo/results/training2GZMP2-WDG/
public class TapeEquilibrium {
    public static void main(String[] args) {
        //int[] A = {-1000,1000};
        //int[] A = {-10, -20, -30, -40, 100};
        int[] A = {3,1,2,4,3};
        int solution = solution(A);
        System.out.println("solution = " + solution);
    }
    public static int solution(int[] A) {

        int result = Integer.MAX_VALUE;
        int length = A.length;
        int[] arr1 = new int[length-1];
        Stack<Integer> stack = new Stack<>();
        int su1 = 0;
        int su2 = 0;

        for(int i=0; i<length-1; i++){
            int su = A[i];
            su1 += su;
            arr1[i] = su1;
        }
        for(int i=length-1; i>0; i--){
            su2 += A[i];
            stack.push(su2);
        }
        for(int i : arr1){
            int su = Math.abs(i-stack.pop());
            result = Math.min(result, su);
        }

        return result;
    }
}
