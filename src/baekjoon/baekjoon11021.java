package baekjoon;
import java.util.Scanner;

public class baekjoon11021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int t = scr.nextInt();
		
		for(int i = 1; i<=t; i++) {
			int a = scr.nextInt();
			int b = scr.nextInt();
			System.out.println("Case #"+i+": "+(a+b));
		}
		scr.close();

	}

}
