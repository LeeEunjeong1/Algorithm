package Baekjoon.FastCampus;

// 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.

// 1부터 N까지 자연수 중에서 M개를 고른 수열
// 같은 수를 여러 번 골라도 된다.
public class boj_15651 {

    // M개를 전부 고름 -> 조건에 맞는 탐색을 한 가지  성공한 ㄱ ㅓㅅ!
    // 아직 M개를 고르지 않음 -> k번째부터 M번째 원소를 조건에 맞게 고르는 모든 방법을 시도한다

    static int N,M;
    static int[] selected ;
    public void sequence(int N, int M){
        
    }
    public static void main(String[] args) {
        boj_15651 bObject = new boj_15651();       
        int N = 3;
        int M = 1;
        bObject.sequence(N, M);

    }
    
}
