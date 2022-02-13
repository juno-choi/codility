import java.util.Arrays;

//
public class PermMissingElem {
    public static void main(String[] args) {
        int[] A = {2,3,1,5};
        int solution = solution(A);
        System.out.println("solution = " + solution);
    }
    public static int solution(int[] A) {
        int result = 1;

        Arrays.sort(A);

        for(int a : A){
            if(a == result) result ++;
            else return result;
        }

        return result;
    }
}
