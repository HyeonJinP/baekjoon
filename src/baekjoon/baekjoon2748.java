package baekjoon;
import java.util.Scanner;

public class baekjoon2748 {
	
	static int fibo(int n) {
		
		int a = 0, b = 1, c = a+b;
		if(n == 0)
			return a;
		else if(n == 1)
			return b;
		else {
			for(int i = 0; i<=n-2; i++) {
				c = a+b;
				a = b;
				b = c;
			}
			return c;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int num = fibo(n);
		System.out.println(num);
		
		scr.close();

	}

}
