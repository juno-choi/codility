//
public class PassingCars {
    public static void main(String[] args) {
        int[] A = {0,1,0,1,1};
        int solution = solution(A);
        System.out.println("solution = " + solution);
    }
    public static int solution(int[] A) {
        int result = 0;
        int temp = 0;
        for(int i=A.length-1; i>=0; i--){
            if(A[i] == 0) result += temp;
            else temp++;
        }

        if(result>1000000000 || result<0) return -1;
        return result;
    }
}
