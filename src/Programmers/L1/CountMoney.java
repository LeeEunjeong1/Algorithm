package Programmers.L1;

//위클리 챌린지 - 부족한 금액 계산하기

public class CountMoney {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;

        for(int i = 1 ; i<count+1 ; i++){
            sum = sum+ price*i;   
            // System.out.println(price*i);   
            System.out.println(sum);        
        }
        answer = sum - money;
        if(sum<=money){
            return 0;
        }

        return answer;
    }
}
