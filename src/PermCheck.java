//https://app.codility.com/demo/results/trainingTMX9ZK-M36/
public class PermCheck {
    public static void main(String[] args) {
        int[] A = {1,2,3,100000000};
        int solution = solution(A);
        System.out.println("solution = " + solution);
    }
    public static int solution(int[] A) {
        int length = A.length;
        int[] arr = new int[100001];
        arr[0] = 1;
        for(int a : A){
            if(a>100000) return 0;
            arr[a] = 1;
        }
        for(int i=1; i<length+1; i++){
            if(arr[i]==0) return 0;
        }

        return 1;
    }
}
