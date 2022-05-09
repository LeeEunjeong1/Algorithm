package Programmers.L1;

public class Lotto {
    public int[] solution(int[] lottos, int[] win_nums) {
        int cnt=0;
        int cnt_1=7; //최저
        int[] answer = new int[2];

        for(int i = 0 ; i< lottos.length;i++){
            if(lottos[i]==0){
                cnt = cnt+1;
                System.out.println("cnt "+cnt);
            }else{
                for(int j = 0 ; j< win_nums.length;j++){
                    if(lottos[i]==win_nums[j]){
                        cnt_1 = cnt_1-1;
                        System.out.println("cnt_1 "+cnt_1);
                    }
                }
            }            
        }

        if(cnt_1 == 7 && cnt == 0){ // 다 0이고, 하나도 맞지 않는 경우
            answer[0]=6;
            answer[1]=6; 

        }else{
            if(cnt_1 == 7){
                answer[1]=6;
            }else{
                answer[1] = cnt_1; // 최저 등수
            }    
            if(cnt==0){
                answer[0] = cnt_1; //최고 등수
            }else{
                answer[0] = cnt_1-cnt; //최고 등수
            }
        }
  
        return answer;
    }
    public static void main(String[] args) {
        Lotto lObject = new Lotto();
        int[] lottos = {44, 1, 2, 4, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        System.out.println(lObject.solution(lottos, win_nums)[0]+" "+lObject.solution(lottos, win_nums)[1]);
    }
    
}
