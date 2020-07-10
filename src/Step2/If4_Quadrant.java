package Step2;

import java.util.Scanner;

public class If4_Quadrant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x>0) {
			if(y>0)System.out.println("Quadrant 1");
			else System.out.println("Quadrant 4");
		}
		else {
			if(y>0)System.out.println("Quadrant 2");
			else System.out.println("Quadrant 3");
		}
	}

}
