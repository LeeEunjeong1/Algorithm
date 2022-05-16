package Programmers;

import java.util.HashMap;
import java.util.HashSet;
//https://jangcenter.tistory.com/116

public class Report {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        HashMap<String,HashSet<String>> reportMap = new HashMap<String,HashSet<String>>(); //리폿 리스트
        HashMap<String, Integer> idxMap = new HashMap<>();
        //정지 메일 받는 사람

        //reportMap 초기화
        for(int i = 0 ; i< id_list.length;i++){
            reportMap.put(id_list[i],new HashSet<>());
            idxMap.put(id_list[i],i);   
        }

        //reportMap에 신고 기록하기
        for(int i = 0 ; i<report.length ; i++){
            String reporting = report[i].split(" ")[0]; //리폿 한 친구
            String reported = report[i].split(" ")[1]; // 리폿당한 친구
           
            reportMap.get(reported).add(reporting); //신고받은 친구 / 신고한 친구
            System.out.println(reportMap);
        }

        //k번 이상 신고당하면 이용 정지
        for(int i = 0 ; i<id_list.length;i++){
            HashSet<String> send = reportMap.get(id_list[i]);
            if(send.size() >= k){ 
                for(String name : send){
                    answer[idxMap.get(name)] ++ ;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args){
        Report rObject = new Report();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        System.out.println(rObject.solution(id_list, report, k));
        
    }
    
}
