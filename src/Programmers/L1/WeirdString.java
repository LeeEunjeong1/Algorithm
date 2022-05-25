package Programmers.L1;

import java.util.ArrayList;

// 연습문제 - 이상한 문자 만들기

public class WeirdString {
    public String solution(String s) {
        String answer = "";
        ArrayList<Integer> blank = new ArrayList<Integer>();

        for(int i = 0 ; i<s.length();i++){
            if(s.charAt(i) == ' '){
                blank.add(i); // 공백의 번지수        
            }      
   
        }
        blank.add(s.length());

        for(int b : blank){
            for(int i = 0 ; i<s.length()+1;i++){  
                if(i == b||blank.get(blank.indexOf(b)) == blank.size()-1){ // 공백을 만난 것
           
                    String word = "";
             
                    if(blank.indexOf(b)==0){
                         word = s.substring(0, i);
                    }else if(b==s.length()){
                        word = s.substring(blank.get(blank.indexOf(b)-1)+1, i);


                    }else{
                        word = s.substring(i-(blank.get(blank.indexOf(b)-1))-2, i);
                   }
                
                    for(int j = 0 ; j<word.length() ; j++){
                        if(j%2==0){
                            //짝수이면 대문자
                            answer += Character.toUpperCase(word.charAt(j));
                        }else{
                            //홀수이면 소문자
                            answer += Character.toLowerCase(word.charAt(j));
                        }
                    }
                    if(i < s.length()-1){
                        answer+=" ";  
                    }
                               

                }

            }
            
        }
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
        WeirdString wObject = new WeirdString();
        wObject.solution("try hello world");
    }
}
