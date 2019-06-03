package baekjoon;
import java.util.Scanner;

public class baekjoon2441 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		
		for(int i=n; i>0; i--) {
			for(int j=1; j<=n; j++) {
				if(j<=n-i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		scr.close();

	}

}
