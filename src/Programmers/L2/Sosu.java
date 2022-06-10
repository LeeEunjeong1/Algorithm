package Programmers.L2;

import java.util.*;

// 완전탐색 - 소수찾기 

public class Sosu {
    public int solution(String numbers) {
        Set<Integer> set = new HashSet<>();
        int answer = 0;
        
        //조합 재귀함수
        dfs(numbers,"",set);     

        //소수판별
        for(Integer num : set){
            if(isPrime(num)){
                answer++;
            }
        }
                
        return answer;
    }

    // dfs 재귀 - 숫자 조합 후 소수면 set에 추가
    public void dfs(String numbers, String str, Set<Integer> set){
        if(!str.equals("")){
            set.add(Integer.valueOf(str));
        }
        for(int i = 0 ; i<numbers.length();i++){
            dfs(numbers.substring(0, i)+numbers.substring(i+1,numbers.length()),str+numbers.charAt(i),set);
        }
    }

    // 소수 찾기
    public boolean isPrime(int num){
        if(num ==0 || num==1){
            return false; //소수 아님
        }
        for(int d = 2 ; d<num ; d++){
            if(num %d == 0){
                //약수를 갖고있다 -> 소수가 아니다  
                return false;          
            }
        }
        return true; // 소수
    }

    public static void main(String[] args) {
        Sosu sObject = new Sosu();
        String numbers = "17";
        sObject.solution(numbers);
    }
    
}
