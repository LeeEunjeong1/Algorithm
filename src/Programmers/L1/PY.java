package Programmers.L1;

public class PY {
    boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;

        for(int i = 0 ; i<s.length();i++){
            if(s.charAt(i)=='p'||s.charAt(i)=='P'){
                cnt = cnt+1;
            }
            if(s.charAt(i)=='y'||s.charAt(i)=='Y'){
                cnt = cnt-1;
            }
        }

        if(cnt ==0){
            answer = true;
        }else{
            answer = false;
        }

        return answer;
    }
}
