package Programmers.L2;

import java.util.*;

//2021 KAKAO BLIND RECRUITMENT - 메뉴 리뉴얼 (조합)
/*
 1. 각 order 정렬 -> 순서가 중요할 경우 정렬을 한다
 2. course 길이만큼 모든 조합 생성 HashMap<조합,갯수>
 3. 가장 많은 조합 answer에 저장
 */

public class Menu {
    List<String> answerList = new ArrayList<>();
    Map<String, Integer> hashMap = new HashMap<>();
    public String[] solution(String[] orders, int[] course) {
 
        // 1. orders 정렬
        for(int i = 0 ; i<orders.length;i++){
            char[] menus = orders[i].toCharArray(); // 각 order를 menus배열에 저장
            Arrays.sort(menus); // 오름차순으로 menus 정렬 ex)ABCD
            orders[i] = String.valueOf( menus); // String.valueOf -> 파라미터가 null이면 문자열 null을 만들어서 담는다.
        }

        // 2. 조합 만들기
        for(int length : course){
            for(String order : orders){
                combination("",order,length); //조합 함수                
            }
            // 3. 가장 많은 조합 answer에 저장
            if(!hashMap.isEmpty()){
                List<Integer> countList = new ArrayList<>(hashMap.values());
                int max = Collections.max(countList);

                if(max > 1){
                    for(String key : hashMap.keySet()){
                        if(hashMap.get(key) == max){
                            answerList.add(key);
                        }
                    }
                }
                hashMap.clear();
            }
        }

        Collections.sort(answerList);
        String[] answer = new String[answerList.size()];
        for(int i = 0 ; i<answer.length;i++){
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    // 재귀함수 = 조합
    public void combination(String order, String others, int count){ 
        // 탈출 조건 : count == 0
        if(count == 0 ){
            hashMap.put(order, hashMap.getOrDefault(order, 0) + 1);
            return;
        }
        // 0부터 length까지 조합
        for(int i = 0 ; i<others.length();i++){
            combination(order+others.charAt(i), others.substring(i+1), count-1); 
        }

    }
    public static void main(String[] args) {
        Menu mObject = new Menu();
        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course = {2,3,4};
        //	["AC", "ACDE", "BCFG", "CDE"]
        mObject.solution(orders, course);
    }
}
