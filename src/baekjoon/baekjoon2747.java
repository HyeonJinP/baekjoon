package baekjoon;
import java.util.Scanner;

public class baekjoon2747 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int answer, a = 0, b = 1;
		if(n == 0) {
			answer = a;
		}
		else {
			answer = a+b;
		}
		
		for(int i=0; i<=n-2; i++) {
			answer = a+b;
			a = b;
			b = answer;
		}
		System.out.print(answer);
		scr.close();

	}

}
