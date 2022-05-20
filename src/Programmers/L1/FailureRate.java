package Programmers.L1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class FailureRate {
    public int[] solution(int N, int[] stages) {
        int[] answer=new int[N];
        ArrayList<Integer> list  = new ArrayList<Integer>();
        int size = stages.length;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        //N번째 스테이지까지 통과
        for(int j = 1 ; j<N+1;j++){
            System.out.println("N "+j );
            for(int i = 0 ; i<stages.length;i++){
                int cnt =0;
                
                if(stages[i]<=j && size >0){
                    //i번째가 j번째 스테이지 실패하면 cnt 1증가, size size에서 cnt 빼기
                    cnt = cnt+1;
                    size = size-cnt;
                   
                }
                System.out.println("cnt "+cnt+" size "+size);
                //키(번호)-밸류(실패율)
                         
            }
        }
        for(int i=0;i<map.size();i++){
            //실패율 내림차순 정렬을 위해 list에 넣기           
            list.add(map.get(i));          
        }
        //내림차순 정렬 - 실패율 리스트
        Collections.sort(list, Collections.reverseOrder());

        for(int i = 0 ;i<list.size();i++){
            for (Integer key : map.keySet()) {
                Integer value = map.get(key);    
                if (value == list.get(i)) {
                    answer[i]=key;
                }
            }
        }

        
        return answer;
    }
    public static void main(String[] args) {
        FailureRate fObject = new FailureRate();
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        fObject.solution(N, stages);
        
    }
    
}
