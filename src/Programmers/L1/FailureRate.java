package Programmers.L1;

import java.util.HashMap;

public class FailureRate {
    public int[] solution(int N, int[] stages) {
        int[] answer=new int[N];
        HashMap<Integer,Double> map = new HashMap<Integer,Double>();

          for(int i = 1 ; i<N+1;i++){
            int stage = i;
            int noClearPlayer = 0;
            int currentStagePlayer = 0;
            
            for(int j=0; j < stages.length; j++) {
                int player = stages[j];
                
                //현재 스테이지 클리어 못한사람
                if(stage == player) {
                    noClearPlayer++;
                }
                //현재 스테이지 도전자
                if(stage<=player) {
                    currentStagePlayer++;
                }
            }
            
            double failureRate = 0;
              //스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수 (도전자수)
            if(noClearPlayer!=0 && currentStagePlayer!=0) {
                failureRate = (double)noClearPlayer / (double)currentStagePlayer;
            }
            
            map.put(stage, failureRate);

        }
        //내림차순 정렬 - 실패율 리스트
        for(int i=0; i<N; i++) {
            double max = -1;
            int maxKey = 0;
            for(Integer key : map.keySet()) {
                if(max < map.get(key)) {
                    max = map.get(key);
                    maxKey = key;
                }
            }
            answer[i] = maxKey;
            map.remove(maxKey);
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
