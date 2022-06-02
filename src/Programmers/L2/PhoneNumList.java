package Programmers.L2;

public class PhoneNumList {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        for(int i = 0 ; i <phone_book.length ; i++){
            for(int j = 0 ; j<phone_book.length ; j++){
                if(phone_book[i].length()<=phone_book[j].length()){
                    if(phone_book[i].equals(phone_book[j].substring(0, phone_book[i].length()))&& phone_book[i] != phone_book[j]){
                        System.out.println("false" +phone_book[i]);
                        return false;
                        // answer = false;
                        // break;
    
                    }else{
                        System.out.println("true" +phone_book[i]);
                        answer = true;
                    }
                }else{
                    System.out.println("true" +phone_book[i]);
                    answer = true;
                }
              
            }
          

        }
        
        System.out.println("answer "+answer);
        return answer;

    }
    public static void main(String[] args) {
        PhoneNumList pObject = new PhoneNumList();
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(pObject.solution(phone_book));
        
    }
    
}
