package Programmers;

public class Report {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};

        return answer;
    }
    public static void main(String[] args){
        Report rObject = new Report();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        System.out.println(rObject.solution(id_list, report, k));
        
    }
    
}
