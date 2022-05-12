package Programmers;

import java.util.ArrayList;
import java.util.HashMap;

public class Report {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};

        HashMap<String,String> reportMap = new HashMap<String,String>(); //리폿 리스트

        for(int i = 0 ; i<report.length ; i++){
            String reporting = report[i].split(" ")[0]; //리폿 한 친구
            String reported = report[i].split(" ")[1]; // 리폿당한 친구
           
            reportMap.put(reporting,reported);

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
