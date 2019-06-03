package baekjoon;
import java.util.Scanner;

public class baekjoon2523 {
	
	static void print_star(int n) {
		
		for(int i=0; i<2*n-1; i++) {
			for(int j=0; j<n; j++) {
				if(i<n) {
					if(j<=i)
						System.out.print("*");
					else
						break;
				}
				else {
					if(j<2*n-1-i)
						System.out.print("*");
					else
						break;
				}
			}
			
			if(i < 2*n-2) {
				System.out.println();
			}
			
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
