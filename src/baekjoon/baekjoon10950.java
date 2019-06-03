package baekjoon;
import java.util.Scanner;

public class baekjoon10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int t = scr.nextInt();
		int a,b;
		for(int i = 0; i < t; i++) {
			a = scr.nextInt();
			b = scr.nextInt();
			System.out.println(a+b);
		}
		scr.close();

	}

}
