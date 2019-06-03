package baekjoon;
import java.util.Scanner;

public class baekjoon10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int factorial = 1;
		for(int i=2; i<=n; i++) {
			factorial *= i;
		}
		System.out.print(factorial);
		scr.close();
	}

}
