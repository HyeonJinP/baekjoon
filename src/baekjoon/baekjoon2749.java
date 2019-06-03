package baekjoon;
import java.util.Scanner;

public class baekjoon2749 {
	
	static int fibo(int n) {
		int a = 0, b = 1, num = a+b;
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		else
			for(int i=0; i<=n-2; i++) {
				num = a+b;
				if(num > 1000000) {
					num = num % 1000000;
				}
				a = b;
				b = num;
			}
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		
		int fiboNum = fibo(n);
		System.out.println(fiboNum%1000000);
		
		scr.close();

	}

}
