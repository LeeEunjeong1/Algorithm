package Programmers.L1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortK {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];    
 
        for(int i = 0 ; i< commands.length;i++){
            //1. Arrays로 변경
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int j = 0 ; j<array.length ; j++){
                arr.add(array[j]);            
            }

            //2. 자르기
            int start = commands[i][0]-1;
            int last = commands[i][1];
            int k = commands[i][2]-1;

              //3. 자른 배열 정렬
            List<Integer> arrSort = arr.subList(start, last);         
            Collections.sort(arrSort);

             //4. k번째 숫자 찾기          
            answer[i] = arrSort.get(k);           
        }

        return answer;
    }
    public static void main(String[] args) {
        SortK sObject = new SortK();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands ={ {2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(sObject.solution(array, commands));
    }

    
}
