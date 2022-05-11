package Programmers.L1;

public class Keypad {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        Integer left = 12;
        Integer right = 10;
        
        for(int i = 0; i< numbers.length;i++){
            if(numbers[i]==1|numbers[i]==4||numbers[i]==7){
                left = numbers[i];
                answer += "L";
            }else if(numbers[i]==3|numbers[i]==6||numbers[i]==9){
                right =numbers[i];
                answer += "R";
            }else{
                numbers[i] = numbers[i]==0 ? 11 : numbers[i];

                //가운데 숫자
                int tmpL = distance(Math.abs(numbers[i]-left));
                int tmpR = distance(Math.abs(numbers[i]-right));

                if(tmpL < tmpR){
                    //left가 더 가깝다
                    left =numbers[i];
                    answer += "L";
                }else if(tmpL > tmpR){
                    //right가  더 가깝다
                    right =numbers[i];
                    answer += "R";
                }else{
                    if(hand.equals("right")){
                        answer += "R";
                        right = numbers[i];
                    }else{
                        answer +="L";
                        left = numbers[i];
                    }
                    
                }
            }

        }
        return answer;
    }
    public int distance(int num){
        //1. 양 옆 or 위아래 -> 한 칸
        if(num == 1 || num ==3){
            return 1;
        }
        //2. 위 아래 두칸 or 한 칸 대각선 -> 두 칸
        if(num == 2 || num ==4||num==6){
            return 2;
        }
        //3. 두 칸 대각선 -> 세 칸
        if(num==5 || num == 7 || num ==9){
            return 3;
        }
        if(num == 0){
            return 0;
        }
        return 4;    
    }
    public static void main(String[] args) {
        Keypad kObject = new Keypad();
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";
        System.out.println(kObject.solution(numbers, hand));
        
    }
    
}
