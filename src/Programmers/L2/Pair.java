package Programmers.L2;

import java.util.Stack;

// 2017 팁스타운 - 짝지어 제거하기
// https://programmers.co.kr/learn/courses/30/lessons/12973

public class Pair {
    public int solution(String s)
    {
        int answer = -1;
        Stack<Character> sStack = new Stack<>();

        for(int i= 0 ; i<s.length();i++){
            if(!sStack.isEmpty() && sStack.peek()== s.charAt(i)){
                
                sStack.pop();
            }else{
                sStack.push(s.charAt(i));
            }
        }
        if(sStack.isEmpty()){
            answer = 1;
        }else{
            answer = 0;
        }


        return answer;
    }
    public static void main(String[] args) {
        Pair pObejct = new Pair();
        String s = "baabaa";
        pObejct.solution(s);
        
    }
    
}
