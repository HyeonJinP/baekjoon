package baekjoon;
import java.util.Scanner;

public class baekjoon2445 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		
		for(int i = 1; i <= 2*n; i++) {
			for(int j = 1; j <= 2*n; j++) {
				if(i <= n) {
					if(j <= i) {
						System.out.print("*");
					}
					else if(j > 2*n-i ) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				else {
					if(j <= 2*n-i) {
						System.out.print("*");
					}
					else if(j > i ) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		
		scr.close();

	}

}