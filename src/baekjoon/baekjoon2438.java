package baekjoon;
import java.util.Scanner;

public class baekjoon2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			if(i<n) {
				System.out.println();
			}
		}
		
		scr.close();

	}

}