package Programmers.L1;

import java.util.ArrayList;
import java.util.Collections;

//월간 코드 챌린지 시즌1 - 두 개 뽑아서 더하기

public class PlusNumber {

    public int[] solution(int[] numbers) {
        ArrayList<Integer> plus = new ArrayList<>();

        //두 수 더한 것 리스트에 모두 저장 - 중복X
        for(int i = 0 ; i < numbers.length ; i++){
            for(int j = i+1 ; j < numbers.length ; j++){
                if(!plus.contains(numbers[i]+numbers[j])){
                    plus.add(numbers[i]+numbers[j]);
                }               
            }
        }

        //오름차순으로 정렬
        Collections.sort(plus);
        int[] answer = new int[plus.size()];
  

        for(int i = 0;i<plus.size();i++){
            answer[i]=plus.get(i);
            System.out.println(answer[i]);
        }


        return answer;
    }

    public static void main(String[] args) {
        PlusNumber pObject = new PlusNumber();

        int[] numbers ={0, 100, 1000, 10};

        pObject.solution(numbers);
    }


    
}


