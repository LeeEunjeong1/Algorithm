package Programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    Integer count ; //리폿 카운트
    String[] reportUser = {}; // 리폿 유저
    ArrayList<String> outUser = new ArrayList<String>(); //정지당한 유저
    ArrayList<String> reportingUser = new ArrayList<String>(); //리폿한 유저
    ArrayList<String> reportedUser = new ArrayList<String>(); //리폿당한 유저
    HashMap<String,String> hashMapRepot = new HashMap<String,String>();
    HashMap<String,Integer> result  = new HashMap<String,Integer>();

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
    
        //중복제거
        HashSet<String> reportSet = new HashSet<String>();
        for(int i = 0 ; i<report.length ; i++){
            reportSet.add(report[i]);
        }
        System.out.println(reportSet);

        HashMap<String, ArrayList<String>> notifyListHash = new HashMap<>();
        HashMap<String,Integer> reportCount = new HashMap<String,Integer>();
        for (String rep : reportSet){ 

            int blankIdx = rep.indexOf(" "); 
            String reporter = rep.substring(0, blankIdx); 
            String reportee = rep.substring(blankIdx + 1); 
            ArrayList<String> reporterList = notifyListHash.getOrDefault(reporter, null); 
            if(reporterList == null) reporterList = new ArrayList<>(); 
            reporterList.add(reportee); 
            notifyListHash.put(reporter, reporterList); 

            count =1;     
               
            reportCount.forEach((key, value) -> {
                String key1 = key;
                String re = reportee;
                if(key1.equals(re)){
                    count+=1;
                }
            });             
            reportCount.put(reportee, count);
        }
        reportCount.forEach((key,value)->{
            notifyListHash.forEach((key1,value1)->{
                if(value>=k && value1.contains(key) ){
                    System.out.println(key1+" " +value1);
                    outUser.add(key1);
                }
            });
           
        });
        for(int i = 0 ; i<outUser.size() ; i++){
            for(int j = 0 ; j<i ; j++){
                if(outUser.get(i).equals(outUser.get(j))){
                }
            }
        }
               
        System.out.println(outUser);
        // System.out.println(notifyListHash);
        // System.out.println(reportCount);

        return answer;
    }
    public static void main(String[] args){
        Solution sObject = new Solution();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
    
        System.out.println(sObject.solution(id_list, report, k));
    }
}
