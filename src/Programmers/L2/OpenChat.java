package Programmers.L2;

import java.util.ArrayList;
import java.util.HashMap;

public class OpenChat {
    public String[] solution(String[] record) {
        
        ArrayList<String> msg = new ArrayList<String>();        
        HashMap<String,String> nickname = new HashMap<String,String>();
        System.out.println(record.length);

        for(int i = 0 ;i< record.length;i++){
            System.out.println(i);
                 
            String[] recordArr = record[i].split(" "); 

            // if(recordArr[0].equals("Enter")){
            //      // 들어왔습니다 + 닉네임 
            //      nickname.put(recordArr[1], recordArr[2]); // uid/닉네임
            //      msg.add(recordArr[1]+"님이 들어왔습니다.");

            // }else if(recordArr[0].equals("Leave")){
            //     msg.add(recordArr[1]+"님이 나갔습니다.");         

            // }else{
            //     nickname.put(recordArr[1],recordArr[2]); // uid/닉네임
            // }

            switch(recordArr[0]){
                case "Enter":{
                      // 들어왔습니다 + 닉네임 
                    nickname.put(recordArr[1], recordArr[2]); // uid/닉네임
                    msg.add(recordArr[1]+"님이 들어왔습니다.");
                    break;
                }
                case "Leave":{
                    msg.add(recordArr[1]+"님이 나갔습니다.");         
                    break;
                }
                case "Change":{
                    nickname.put(recordArr[1],recordArr[2]); // uid/닉네임
                    break;
                }
            }
        }
        String[] answer = new String[msg.size()];
        for(int i = 0 ; i<msg.size();i++){
            int idx = msg.get(i).indexOf("님");
            String uid = msg.get(i).substring(0,idx);

            String message = msg.get(i).substring(idx,msg.get(i).length());
            answer[i] = nickname.get(uid)+message;
        }

        return answer;
    }
    public static void main(String[] args) {
        OpenChat oObject = new OpenChat();
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        oObject.solution(record);
    }
}
