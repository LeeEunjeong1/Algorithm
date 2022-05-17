package Programmers.L1;

import java.util.ArrayList;

//2019 카카오 개발자 겨울 인턴십 - 크레인 인형뽑기 게임

public class Crane {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> pot = new ArrayList<Integer>();

        for(int i = 0 ;  i<moves.length ;i++){  
            int location = moves[i]-1; // 기계 위치    
                  
            for(int j = 0 ;j<board.length;j++){
                int item = board[j][location];
               
                if(item!=0){                
                    if(pot.size()!=0 && pot.get(pot.size()-1)==item){
                        pot.remove(pot.size()-1);
                        answer+=2;
                       
                    } else{
                        pot.add(item);
                    }                    
                    board[j][location] = 0;                                       
                    break;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Crane cObject = new Crane();
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        cObject.solution(board, moves);
        
    }
    
}
