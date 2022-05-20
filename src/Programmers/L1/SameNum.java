package Programmers.L1;

import java.util.ArrayList;

public class SameNum {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
     
        list.add(arr[0]);
        for(int i =1 ;i < arr.length;i++){
            if(arr[i] != arr[i-1]){
                list.add(arr[i]);
            }
          

        }
        System.out.println( list );
        int[] answer = new  int[list.size()];

        for(int i = 0 ; i<list.size();i++){
            answer[i] = list.get(i);
            System.out.println(answer[i]);
        }

        return answer;
    }
    public static void main(String[] args) {
        SameNum sObject = new SameNum();
        int[] arr = {1,1,3,3,0,1,1};
        sObject.solution(arr);
    }
    
}