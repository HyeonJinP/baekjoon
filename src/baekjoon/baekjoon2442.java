package baekjoon;
import java.util.Scanner;

public class baekjoon2442 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		
		for(int i=1; i <= n; i++) {
			for(int j=1; j <= 2*n-1; j++) {
				if(j >= n+i)
					break;
				else if( ( j<=n && j>n-i ) || ( j>n && j<n+i ) )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		scr.close();

	}

}
