package baekjoon;
import java.util.Scanner;

public class baekjoon2739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
		
		scr.close();

	}

}