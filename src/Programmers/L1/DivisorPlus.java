package Programmers.L1;

public class DivisorPlus { 
    public int solution(int left, int right) {
        int answer = 0;

        // 1. left부터 right까지 숫자 구하기
        for(int i = left ; i<right+1 ; i++){  
            int cnt =0;       
            // 2. 해당 숫자마다 약수 개수      
            for(int d = 1; d<=i;d++){
                if(i%d==0){
                    cnt++;
                }
            }  
            // 3. 약수의 개수가 짝수면 더하고, 홀수면 빼기 
            if(cnt %2==0){
                answer += i;
            }else{
                answer-=i;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        DivisorPlus dObject = new DivisorPlus();
        System.out.println(dObject.solution(13, 17));
        
    }
    
}
