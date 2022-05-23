package Programmers.L1;

import java.util.ArrayList;
import java.util.Collections;

public class SortString {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        ArrayList<String> array = new ArrayList<String>();

        //n번째 문자 문자열 맨 앞에 붙이기            
        for (int i=0; i<strings.length; i++) {
            array.add(strings[i].charAt(n) + strings[i]);
        }

        //정렬    
        Collections.sort(array);
        
        // n번째 문자 잘라내서 answer배열에 넣기
        for (int i=0; i<array.size(); i++) {
            answer[i] = array.get(i).substring(1);
        }
        
        return answer;
    }
    public static void main(String[] args) {
        
    }
    
}
