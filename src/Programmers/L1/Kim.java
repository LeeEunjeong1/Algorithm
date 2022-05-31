package Programmers.L1;

public class Kim {
    public String solution(String[] seoul) {
        String answer = "";
        for(int i = 0 ; i<seoul.length ; i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 "+i+"에 있다";
            }
        }
       
        return answer;

    }
    public static void main(String[] args) {
        
    }
    
}
