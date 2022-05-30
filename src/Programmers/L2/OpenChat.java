package Programmers.L2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class Uid{
    String uid;
}

public class OpenChat {
    public String[] solution(String[] record) {
        String[] answer = new String[record.length];
        
        ArrayList<String> answerArr = new ArrayList<String>();
        ArrayList<String> msg = new ArrayList<String>();
        
        HashMap<String,String> nickname = new HashMap<String,String>();
        for(int i = 0 ;i< record.length;i++){
                 
            String[] recordArr = record[i].split(" "); 

            switch(recordArr[0]){
                case "Enter":{ // 들어왔습니다 + 닉네임 
                    nickname.put(recordArr[1], recordArr[2]); // uid/닉네임
                }
                case "Leave":{
                }
                case "Change":{
                    nickname.put(recordArr[1],recordArr[2]); // uid/닉네임
                }
            }

        }
        Iterator<String> uid = msg.keySet().iterator();
        while (uid.hasNext()){
            String key = uid.next();
            answerArr.add(nickname.get(key)+msg.get(key));
        }
        for(int i = 0 ; i < answerArr.size() ; i++){
            answer[i] = answerArr.get(i);
        }
        System.out.println(answer);

        return answer;
    }
    public static void main(String[] args) {
        OpenChat oObject = new OpenChat();
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        oObject.solution(record);
    }
}
