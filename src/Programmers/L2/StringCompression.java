package Programmers.L2;

// 2020 KAKAO BLIND RECRUITMENT - 문자열 압축


// 문자열의 길이를 n이라고 할 때 문자열을 1부터 n/2까지 쪼개며 압축시킨 경우를 전부 확인 -> 완전탐색
// 1~s.length()/2 각 단위로 압축했을 때 문자열 길이가 가장 짧은 단위 찾기
// substring(int start, int end) 이용해서 문자열 자르기
// 자른 문자열이 동일할때 -> 하나로 압축 + 반복횟수 증가
// 다른 문자열이 나오면 -> [반복횟수+문자]를 새로운 문자열에 추가

public class StringCompression {
    public int solution(String s) {
        int answer = Integer.MAX_VALUE;
        
        // 문자열 길이 1 -> 압축X
        if(s.length() == 1) return 1;

        // 1~s.legnth()/2 단위로 압축
        for(int i = 1 ; i <= s.length()/2 ; i++){
            String str = ""; // 압축 결과 문자열
            String prevStr = ""; // 이전 문자열
            int count = 1; // 연속 갯수

            for(int j = 0 ; j <= s.length() - i ; j+=i){ // 문자열 자르기
                String curStr = s.substring(j, j+i);

                // 문자열 연속 여부 체크
                if(prevStr.equals(curStr)){ // 이전 문자열과 현재 문자열이 같으면 
                    count ++; // count 증가
                    continue; // 문자열 새로 추가 X -> 다음 문자열 비교하기
                }else if (count > 1){ // 이전 문자열과 현재 문자열이 같이 않고, count가 1보다 큰 경우
                    str += count+prevStr; // 연속 갯수+문자열 추가
                    count = 1; // count 1로 초기화
                }else{ // 이전 문자열과 현재 문자열이 같지 않고, count가 1인 경우
                    str += prevStr; // 문자열 추가
                }
                
                prevStr = curStr; // 비교 문자열 갱신 prevStr -> curStr
            }

            if(count > 1){ // count가 1보다 크면
                str  += count+prevStr; 
            }else{
                str += prevStr;
            }

            if(s.length() % i != 0){
                str += s.substring(s.length()-s.length()%i, s.length());            
            }

            answer = Math.min(answer,str.length()); // 가장 작은 길이 -> answer
            System.out.println(answer);
            System.out.println(str);
        }
     

        return answer;
    }
    public static void main(String[] args) {
        StringCompression sObject = new StringCompression();
        String s = "aabbaccc";
        sObject.solution(s);
    }
    
}
