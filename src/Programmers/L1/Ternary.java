package Programmers.L1;

import java.util.Stack;

public class Ternary {
    public int solution(int n) {
        int answer = 0;

        Stack<Integer> stack = new Stack<Integer>();
        int count = 0;

        while(n>0){
            stack.add(n%3);
            n = n/3;
            count++;
        }

        for(int i = 0 ; i<count ; i++){
            answer += stack.pop() *(Math.pow(3, i));
        }
        return answer;
    }
    public static void main(String[] args) {
        Ternary tObject = new Ternary();
        tObject.solution(5);
        
    }
    
}
