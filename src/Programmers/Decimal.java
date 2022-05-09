package Programmers;

public class Decimal {
    public int solution(int[] nums) {
        int answer = -1;
        int cnt = 0 ;

        for(int i = 0 ; i< nums.length;i++){
          
            for(int j = i+1 ; j<nums.length;j++){
              
                for(int k=j+1 ;k<nums.length;k++){
                    int sosuPre = nums[i]+nums[j]+nums[k];
                    cnt++;
                    for(int d = 2 ; d<sosuPre ;d++){
                        if(sosuPre % d == 0){
                            System.out.println(sosuPre);
                            cnt--;
                            break;
                        }
                    }

                }
            }
        }

        
        answer = cnt;

        return answer;
    }
    public static void main(String[] args) {
        Decimal dObject = new Decimal();
        int[] nums = {1,2,3,4};

        System.out.println(dObject.solution(nums));
        
    }
    
}
