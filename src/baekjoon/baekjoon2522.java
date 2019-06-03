package baekjoon;
import java.util.Scanner;

public class baekjoon2522 {
	
	static void print_star(int n) {
		for(int i = 1; i <= 2*n-1; i++) {
			for(int j = 1; j <= n; j++) {
				if(i <= n) {
					if(j>n-i) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				else {
					if(j<=i-n) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}
			}
			if(i == 2*n-1) {
				break;
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();
		print_star(num);
		
		scr.close();
	}

}
