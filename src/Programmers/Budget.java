package Programmers;

import java.util.Arrays;

public class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;

        Arrays.sort(d);
        for(int i = 0 ;i<d.length;i++){
            sum += d[i];
            if(sum >budget){
                break;
            }
            answer++;
        }

        return answer;
    }
    public static void main(String[] args) {
        Budget bObject = new Budget();
        int[] d = {1,3,2,5,4};
        int budget = 9;
        System.out.println(bObject.solution(d, budget));
        
    }
    
}
