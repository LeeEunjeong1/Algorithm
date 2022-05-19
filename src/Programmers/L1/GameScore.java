package Programmers.L1;

import java.util.ArrayList;

// 2018 KAKAO BLIND RECRUITMENT - 1차 다트게임
public class GameScore {
    public int solution(String dartResult) {
        int answer = 0;
        int cnt = 0;
        ArrayList<Integer> num = new ArrayList<Integer>();

        for(int i = 0 ;i<dartResult.length();i++){
            if(dartResult.charAt(i) >= 48 && dartResult.charAt(i) <= 57){
                if(dartResult.charAt(i)=='1'&& dartResult.charAt(i+1)=='0'){
                    num.add(10);                
                    cnt = cnt+1;
                    i++;
                }else{
                    num.add(Character.getNumericValue(dartResult.charAt(i)));
                }  
            } 
            System.out.println(num);  
        }
        
        ArrayList<Double> list = new ArrayList<Double>();
        if(cnt>0){
            dartResult = dartResult.replaceAll("10", "0");
           
        }
        System.out.println(dartResult);
        
        for(int i = 1 ; i <dartResult.length() ; i++){
            int number = 0;
            if((i-1)/2>=3){
                number = 2;
            } else{
                number = (i-1)/2;
            }
            System.out.println("ii "+i + " dart "+dartResult.charAt(i)+" i "+(i-1)/2);
            if(dartResult.charAt(i)=='S'){   
                list.add(Math.pow(num.get(number),1));
            }else if(dartResult.charAt(i)=='D'){
                list.add(Math.pow(num.get(number),2));
            }else if(dartResult.charAt(i)=='T'){
                list.add(Math.pow(num.get(number),3));
            }else if(dartResult.charAt(i)=='*'){
                list.set(number, list.get(number)*2); 
                if(number>0){
                    list.set(number-1, list.get(number-1)*2); 
                }
            }else if(dartResult.charAt(i)=='#'){
                //나누기 2 +1   
                list.set(number,list.get(number)*(-1));      
            }
            System.out.println(list);

        }
        System.out.println(list);
        for(int i = 0 ; i<list.size();i++){
            answer = answer + list.get(i).intValue();
            System.out.println(answer);
        }
        
        //S - 1제곱 D - 2제곱 T - 3제곱
        //* - 바로 전 점수 2배 # - 해당 점수 마이너스
        return answer;
    }
    public static void main(String[] args) {
        GameScore gObejct = new GameScore();

        String dartResult = "10D4S10D";
        gObejct.solution(dartResult);
        
    }
    
}
