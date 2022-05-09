package Programmers;

public class Plus {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0 ; i<absolutes.length;i++){
            if(signs[i] == true){ //양수
                answer += absolutes[i];
            }else{
                answer -= absolutes[i];
            }

        }    
        return answer;
    }
    public static void main(String[] args) {

        Plus pObject = new Plus();
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};
    
        System.out.println(pObject.solution(absolutes, signs));
        
    }
   
    
}
