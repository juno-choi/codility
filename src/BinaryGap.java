//https://app.codility.com/demo/results/trainingMKS73Q-8UQ/
public class BinaryGap {
    public static void main(String[] args) {
        int N = 1041;
        int solution = solution(N);
        System.out.println("solution = " + solution);
    }
    public static int solution(int N) {
        // write your code in Java SE 11
        int result = 0;
        String binary = Integer.toBinaryString(N);
        char[] chars = binary.toCharArray();
        int count = 0;
        for(char c : chars){
            if(c=='0'){
                count++;
            }else{
                result = Math.max(result, count);
                count = 0;
            }
        }
        return result;
    }
}
