package Programmers.L1;

public class NewId {
    public String solution(String new_id) {
        String answer = "";
        if(new_id.length()>0){
            //1단계
            answer = new_id.toLowerCase();
            //2단계
            answer = answer.replaceAll("[^0-9a-z-_.]","");
            //3단계        
            answer = answer.replaceAll("\\.+",".");
            //4단계
            answer = answer.replaceAll("^\\.|\\.$", ""); // ^[.]|[.]$ 
            // char first = answer.charAt(0);
            // char last = answer.charAt(answer.length()-1);
            // if(last =='.' && answer.length() >-1){
            //     answer = answer.substring(0,answer.length()-2);
            // }
            // if(first =='.' && answer.length() >-1){
            //     answer = answer.substring(1, answer.length()-1);
            // }
            //5단계
            if(answer.equals("") || answer.equals(null)){
                answer="a";
            }
            //6단계
            if(answer.length()>15){
                answer = answer.substring(0,15);
                if(answer.substring(answer.length()-1).equals(".")){
                    answer = answer.substring(0, answer.length()-1);
                }
            }
            //7단계
            if(answer.length() <3){
                String la = answer.substring(answer.length() - 1);
                while(answer.length()<3){
                    answer+= la;
                }
            }
        }else{
            answer = "aaa";
        }

        return answer;
    }
    public static void main(String[] args) {
        NewId nObject = new NewId();
        String new_id = 	"abcdefghijklmn.p";
        System.out.println(nObject.solution(new_id));
    }
}
