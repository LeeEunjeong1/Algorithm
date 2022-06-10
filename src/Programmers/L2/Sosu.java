package Programmers.L2;

import java.util.ArrayList;

// 완전탐색 - 소수찾기 

public class Sosu {

    ArrayList<Character> numList = new ArrayList<>(); //numbers String -> List
    ArrayList<Integer> answerList = new ArrayList<>(); //answer List
    Boolean[] visited;

    public int solution(String numbers) {
        int answer = 0;

        for(int i = 0 ; i < numbers.length() ; i++){
            System.out.println(numbers.charAt(i));
            numList.get(numbers.charAt(i)); // 리스트에 저장 
        }
        dfs("",0); // 조합할 숫자 리스트, 숫자 리스트 사이즈

        answer = answerList.size();
        System.out.println(answerList);
        
        return answer;
    }

    // dfs 재귀 - 숫자 조합 후 소수면 set에 추가
    public void dfs(String num,int cnt){
        // 탈출조건
        if(cnt == numList.size() ) return; // numList.size()만큼 다 돌았다
        // 숫자 조합
        for(int i = numList.size()-cnt ; i<numList.size();i++){
            if(visited[i]){
                continue; //방문한 적 있으면 넘어간다
            }
            visited[i] = true;
            dfs(num+numList.get(i),cnt+1);
            visited[i]=false;
        }
        // 소수찾기

        int numInt;
        if(num != ""){
            numInt = Integer.parseInt(num);
            if(isPrime(numInt)){      // 소수면 list에 저장
                answerList.add(numInt);
            }
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
