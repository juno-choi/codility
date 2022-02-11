import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//https://app.codility.com/demo/results/trainingW4VJJW-UWF/
public class OddOccurrencesInArray {
    public static void main(String[] args) {
        int[] A = {9,3,9,3,9,7,9};
        int solution = solution(A);
    }
    public static int solution(int[] A) {
        // write your code in Java SE 11
        int result = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for(int a : A){
            map.put(a,(map.getOrDefault(a, 0)+1));
        }

        Set<Integer> keys = map.keySet();
        for (int i : keys) {
            if(map.get(i)%2 > 0){
                result = i;
                break;
            }
        }

        return result;
    }
}
