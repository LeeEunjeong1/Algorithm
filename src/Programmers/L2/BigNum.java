package Programmers.L2;

import java.util.ArrayList;
import java.util.Collections;

// https://junghn.tistory.com/entry/%EC%9E%90%EB%B0%94-int%EB%A5%BC-%EC%9E%90%EB%A6%BF%EC%88%98%EB%B3%84-int-%EB%B0%B0%EC%97%B4%EB%A1%9C-%EB%B6%84%ED%95%A0  (각 자리수 구하기)
// https://programmers.co.kr/learn/courses/30/lessons/42746 (문제 - 정렬 / 가장 큰 수)

public class BigNum {
    public String solution(int[] numbers) {
        String answer = "";
        ArrayList<Integer> numList = new ArrayList<>();

        for(int n : numbers){
            if(n/10 != 0 ){
                numList.add(n/10);
            }
            numList.add(n%10);
            System.out.println(numList);
        }
        Collections.sort(numList,Collections.reverseOrder());

        
        for(int i = 0 ; i < numList.size() ; i++){
            answer += numList.get(i);
        }
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
        BigNum bObject = new BigNum();
        int[] numbers = {3, 30, 34, 5, 9}; // 9534330
        bObject.solution(numbers);
    }
    
}
