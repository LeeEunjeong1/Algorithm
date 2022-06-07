package Programmers.L2;

import java.util.ArrayList;


// https://programmers.co.kr/learn/courses/30/lessons/12973

public class Pair {
    public int solution(String s)
    {
        ArrayList<Character> sList = new ArrayList<Character>();
        int answer = -1;
        for(int i = 0 ; i<s.length();i++){
            sList.add(s.charAt(i));
        }

        for(int i = 0 ; i<sList.size() ; i++){
            System.out.println("i "+i);
            if(sList.size()>2&&sList.get(i).equals(sList.get(i+1))){
                System.out.println(sList.remove(i));
                System.out.println(sList.remove(i));
                i=0;    
                continue;         
            }      
            System.out.println(sList);
  
        }

        return answer;
    }
    public static void main(String[] args) {
        Pair pObejct = new Pair();
        String s = "baabaa";
        pObejct.solution(s);
        
    }
    
}
