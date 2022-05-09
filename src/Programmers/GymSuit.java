package Programmers;

import java.util.ArrayList;

public class GymSuit {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer =  n - lost.length; // 보장된 체육할 친구들 수 (잃어버린 친구들 제외)
        ArrayList<Integer> reserved = new ArrayList<Integer>();
        ArrayList<Integer> losted = new ArrayList<Integer>();

        for(int i = 0 ; i < reserve.length ; i ++){
            reserved.add(reserve[i]);
        }
        for(int i = 0 ; i<lost.length ; i++){
            losted.add(lost[i]);
        }

        //여분 가져왔지만 잃어버림
        for(int i = 0 ; i<losted.size();i++){
            for(int j = 0; j<reserved.size();j++){
                if(losted.get(i)==reserved.get(j)){
                    answer++;
                    losted.remove(i);
                    reserved.remove(j);
                }
            }
        }     

        for(int i = 0 ; i<losted.size();i++){
            for(int j = 0; j<reserved.size();j++){
               if(losted.get(i)-1 == reserved.get(j)){
                    answer++;
                    reserved.remove(j);
                }else if(losted.get(i)+1 == reserved.get(j)){
                    answer++;
                    reserved.remove(j);
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        GymSuit gObject = new GymSuit();
        int n = 7;
        int[] lost = {2,3,4};
        int[] reserve = {1,2,3,6};
        System.out.println(gObject.solution(n, lost, reserve));
    }
}
