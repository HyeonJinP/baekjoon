package baekjoon;
import java.util.Scanner;

public class baekjoon8393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		scr.close();

	}

}
