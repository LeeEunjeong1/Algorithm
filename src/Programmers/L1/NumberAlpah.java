package Programmers.L1;

public class NumberAlpah {
    public int solution(String s) {
        int answer = 0;
        Integer[] num = {0,1,2,3,4,5,6,7,8,9};
        String[] alpha = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String change="";
        String answerString = "";

        for(int i = 0 ; i<s.length();i++){
            char tmp;
            tmp = s.charAt(i);
            if(Character.isDigit(tmp)){
                answerString += tmp;
            }else{
                change += tmp;             
                for(int j = 0 ; j<alpha.length;j++){
                    if(change.equals(alpha[j])){
                        answerString += num[j];
                        change="";
                    }
                }               
            }

        }
        answer = Integer.parseInt(answerString);
        return answer;
    }
    
    public static void main(String[] args) {
        NumberAlpah nObject = new NumberAlpah();
        String s = "23four5six7";
        
        System.out.println(nObject.solution(s));
        
    }
}
