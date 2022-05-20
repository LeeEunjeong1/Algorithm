package Programmers.L1;

public class Middle {
    public String solution(String s) {
        String answer = "";

        if(s.length()%2==0){
            //짝수인 경우
            answer = s.substring(s.length()/2-1, s.length()/2+1);
        }else{
            //홀수인 경우
            answer = s.substring(s.length()/2, s.length()/2+1);
        }
        return answer;
    }
}
