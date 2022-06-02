package Programmers.L2;

import java.util.Arrays;

public class PhoneNumList {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);

        for(int i = 0 ; i <phone_book.length ; i++){
            if(phone_book[i].length()<phone_book[i+1].length()){
                if(phone_book[i].equals(phone_book[i+1].substring(0, phone_book[i].length()))){
                    return false;
                    // answer = false;
                    // break;
                }
            }     

        }
        
        return answer;

    }
    public static void main(String[] args) {
        PhoneNumList pObject = new PhoneNumList();
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(pObject.solution(phone_book));
        
    }
    
}
