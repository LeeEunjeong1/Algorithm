package Programmers.L1;

import java.util.HashMap;

public class Marathon {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> mapP = new HashMap<String, Integer>();
        for(String s:participant){
        
            mapP.put(s,mapP.getOrDefault(s, 0)+1); // 참가자 추가
        }
        for(String s:completion){
            mapP.put(s,mapP.get(s)-1); //완주자 하나씩 제거
        }

        for(String s:mapP.keySet()){
            if(mapP.get(s)!=0){
                answer = s;
                break;
            }

        }

        return answer;
    }
    public static void main(String[] args) {
        Marathon mObject = new Marathon();
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        System.out.println(mObject.solution(participant, completion));
        
    }
    
}

//https://programmers.co.kr/learn/courses/30/lessons/42576/solution_groups?language=java

//getOrDefault(key값,default) - key값으 value, key값이 없으면 default값 지정
