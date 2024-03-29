package Programmers.L2;

// 피보나치 수는 F(0) = 0, F(1) = 1일 때, 1 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 가 적용되는 수 입니다.

// 예를들어

// F(2) = F(0) + F(1) = 0 + 1 = 1
// F(3) = F(1) + F(2) = 1 + 1 = 2
// F(4) = F(2) + F(3) = 1 + 2 = 3 -> 1+1+1
// F(5) = F(3) + F(4) = 2 + 3 = 5 -> 1+1+1+1+1
// F(6) = F(4) + F(5) = 3 + 5 = 8 - > 1+1+1+1+1+1+1+1

public class Fibo {
    public int solution(int n) {
        int answer = 0;
        int[] numList = new int[n+1];
        numList[0] = 0;
        numList[1] = 1;
        numList[2] = 1;
        
        //answer = fibo(n); 
        
        for(int i = 3 ; i <n+1 ; i++){
            numList[i] = (numList[i-1]+numList[i-2])%1234567;
        }
        answer = numList[n]%1234567;
         
        return answer;
    }

    public int fibo(int n){
        // 탈출조건
        if(n==0) return 0;
        if(n==1) return 1;
        return fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args) {
        Fibo fObject = new Fibo();
        fObject.solution(5);
    }
    
}
