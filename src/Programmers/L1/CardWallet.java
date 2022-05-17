package Programmers.L1;

import java.util.ArrayList;
import java.util.Collections;

// 위클리 챌린지 - 최소직사각형

public class CardWallet {
    public int solution(int[][] sizes) {
        int answer = 0;
        ArrayList<Integer> big = new ArrayList<Integer>(); //크다
        ArrayList<Integer> small = new ArrayList<Integer>(); //작다

        for(int i=0 ; i<sizes.length;i++){
            if(sizes[i][0]>=sizes[i][1]){
                big.add(sizes[i][0]);
                small.add(sizes[i][1]);
               
            }else{
                big.add(sizes[i][1]);
                small.add(sizes[i][0]);
            }         

            
        }
        System.out.println(big);
        Collections.sort(big);
        Collections.sort(small);

        answer = big.get(big.size()-1) * small.get(small.size()-1);

     
      
        return answer;
    }
    public static void main(String[] args) {
        CardWallet cObejct = new CardWallet();
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        cObejct.solution(sizes);
        
    }
    
}
