import java.util.HashSet;
import java.util.Set;

//https://app.codility.com/demo/results/trainingECPAMM-3QZ/
public class FrogRiverOne {
    public static void main(String[] args) {
        int X = 5;
        int[] A = {1,3,1,4,2,3,5,4};
        int solution = solution(X, A);
        System.out.println("solution = " + solution);
    }
    public static int solution(int X, int[] A) {
        if(A.length<X) return -1;

        Set<Integer> set = new HashSet<>(); //중복 제거
        int i = 0;
        for(int a : A){
            set.add(a);
            if(set.size() == X) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
