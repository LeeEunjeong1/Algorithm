package Programmers.L1;

public class PhoneNumber {
    public String solution(String phone_number) {
        String answer = "";
        for(int i = 0 ; i<phone_number.length()-4;i++){
            answer += "*";
            System.out.println(answer);
        }
        answer += phone_number.substring(phone_number.length()-4, phone_number.length());
        return answer;
    }
    
}
