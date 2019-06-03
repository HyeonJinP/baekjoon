package baekjoon;
import java.util.Scanner;

public class baekjoon10952 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		while(true) {
			int a = scr.nextInt();
			int b = scr.nextInt();
			if(a==0 && b==0)
				break;
			System.out.println(a+b);
		}
		
		scr.close();

	}

}
