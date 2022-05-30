package Programmers.L1;

import java.util.ArrayList;

public class SmallNum {
    public int[] solution(int[] arr) {
      
        ArrayList<Integer> array = new ArrayList<Integer>();
        
        int num = arr[0];
        int idx = 0 ;
        for(int i = 0 ; i<arr.length;i++){
            if(num > arr[i]){//가장 작은 수 찾기
                idx = i;
                num = arr[i];
            }
        }

        for(int i = 0 ; i<arr.length;i++){
            if(i != idx){
                array.add(arr[i]);
            }
        }

        if(array.size()>0){
            int[] answer = new int[array.size()];
            for(int i = 0 ; i <array.size();i++){
                answer[i] = array.get(i);
            }
            return answer;
        }else{
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        

    }
    
}
