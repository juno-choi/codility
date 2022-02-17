//https://velog.io/@ililil9482/MissingInteger-codility
public class MissingInteger {
    public static void main(String[] args) {
        int[] A = {1, 3, 6, 4, 1, 2};
        int solution = solution(A);
        System.out.println("solution = " + solution);   //5
    }
    public static int solution(int[] A) {
        int[] check = new int[1000001];
        check[0] = 1;

        for(int i=1; i<=A.length; i++){
            int idx = i-1;
            int su = A[idx];
            if(su<0) continue;
            check[su] = 1;
        }

        for(int i=1; i<check.length; i++){
            int su = check[i];
            if(su == 0) return i;
        }

        return check.length+1;
    }
}
