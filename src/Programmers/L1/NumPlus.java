package Programmers.L1;

public class NumPlus {
    public int solution(int[] numbers) {
        int answer = -1;
        int sum = 0;

        for(int i = 0 ; i<numbers.length;i++){
            sum += numbers[i];

        }
        answer = 45-sum;
        return answer;
    }
    public static void main(String[] args) {
        
    }
    
}
