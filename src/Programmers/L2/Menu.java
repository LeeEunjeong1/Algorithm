package Programmers.L2;

import java.util.ArrayList;
import java.util.Collections;

//2021 KAKAO BLIND RECRUITMENT - 메뉴 리뉴얼


public class Menu {
    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        ArrayList<Character> menus = new ArrayList<Character>();

        for(int i = 0 ; i<orders.length;i++){
            for(int j = 0 ; j<orders[i].length();j++){
                menus.add(orders[i].charAt(j)); // 글씨 분리해서 리스트에 넣기
            }
        }
        Collections.sort(menus); //정렬
        

        return answer;
    }
    public static void main(String[] args) {
        Menu mObject = new Menu();
        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course = {2,3,4};
        //	["AC", "ACDE", "BCFG", "CDE"]
        mObject.solution(orders, course);
    }
}
