package Programmers.L2;

import java.util.Arrays;
import java.util.Comparator;

// https://programmers.co.kr/learn/courses/30/lessons/42746 (문제 - 정렬 / 가장 큰 수)

public class BigNum {
    public String solution(int[] numbers) {
        String answer = "";
        String[] sNumbers = new String[numbers.length];

        //String형 배열로 변환
        for(int i = 0 ; i< numbers.length;i++){
            sNumbers[i] = Integer.toString(numbers[i]);
        }

        //두 수를 합친 수 중 큰 값을 앞으로 정렬 (내림차순)
        Arrays.sort(sNumbers, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2){
                return (o2+o1).compareTo(o1+o2);
                //오름차순 정렬 (o1+o2).compareTo(o1+o2);
            }
            
        });

        //000
        if(sNumbers[0].equals("0")) return "0";

        //문자열을 delimiter("") 기준으로 합친다 
        answer = String.join("", sNumbers);
        return answer;
    }
    public static void main(String[] args) {
        BigNum bObject = new BigNum();
        int[] numbers = {3, 30, 34, 5, 9}; // 9534330
        bObject.solution(numbers);
    }
    
}
