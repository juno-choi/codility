import java.util.*;
//https://app.codility.com/demo/results/trainingZHF5D8-HY2/
public class CyclicRotation {
    public static void main(String[] args) {
        int[] A = {};
        int K = 2;

        int[] solution = solution(A, K);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
    public static int[] solution(int[] A, int K) {
        if(A.length == 0){
            return new int[]{};
        }
        Deque deque = new ArrayDeque();
        int[] B = new int[A.length];
        //최초 세팅
        for(int a : A){
            deque.add(a);
        }
        //K만큼 순환
        for(int i=0; i<K; i++){
            int su1 = (int)deque.pollLast();
            deque.addFirst(su1);
        }
        //마지막 return
        Iterator iterator = deque.iterator();
        int i = 0;
        while(iterator.hasNext()){
            int b = (int)iterator.next();
            B[i++] = b;
        }
        return B;
    }
}
