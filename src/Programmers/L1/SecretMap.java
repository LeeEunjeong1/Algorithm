package Programmers.L1;

//2018 KAKAO BLIND RECRUITMENT - [1차] 비밀지도

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i = 0 ; i<n ; i++){
            int a = arr1[i]|arr2[i];
            
            answer[i] = String.format("%0"+n+"d", Long.parseLong(Integer.toBinaryString(a)));
            answer [i] = answer[i].replace("1","#");
            answer [i] = answer[i].replace("0"," ");         
            
        }
        return answer;
    }
    public static void main(String[] args) {
        SecretMap sObject = new SecretMap();
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        sObject.solution(n, arr1, arr2);
    }
    
}
