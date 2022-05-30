package Programmers.L1;

// 연습문제 - 이상한 문자 만들기

public class WeirdString {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");

        int blank = 0;

        for(int i = 0 ; i<str.length;i++){
            if(str[i].equals(" ")){
                blank = 0;
            }else if(blank % 2 == 0){
                str[i] = str[i].toUpperCase();
                blank++;
            }else{
                str[i] = str[i].toLowerCase();
                blank++;
            }
            answer += str[i];
        }

       
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
        WeirdString wObject = new WeirdString();
        wObject.solution("abc abc abc ");
    }
}
