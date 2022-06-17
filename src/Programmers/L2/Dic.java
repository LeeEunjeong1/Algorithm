package Programmers.L2;

import java.util.Arrays;

public class Dic {
    public int solution(String word) {
        int answer = word.length();
        int[] list = new int[5];
        int num=1;
        Character[] str = {'A','E','I','O','U'};

        // 조건 추가
        list[4] = num;
        for(int i = 3 ; i>=0;i--){
            num = num*5+1;
            list[i]= num;
            System.out.println(list[i]);
        }

        for(int i = 0 ; i<word.length();i++){
            
            answer += list[i]*Arrays.asList(str).indexOf(word.charAt(i));
            
        System.out.println(answer);
        }
        return answer;
    }
    public static void main(String[] args) {
        Dic dObject = new Dic();
        String word = "AAAAE";
        dObject.solution(word);
    }
    
}
