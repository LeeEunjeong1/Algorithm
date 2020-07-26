package step5_sil1;

import java.util.Scanner;

public class average_score {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int A = 0;
		for(int i = 0 ;i<5;i++) {
			A = sc.nextInt();
			if(A <40) {
				A = 40;
			}
			sum += A;
			
		}		
		System.out.println(sum/5);
		
		
			
	}

}