package baekjoon;
import java.util.Scanner;

public class baekjoon8958 {
	
	static void sum(String str) {
		int sum = 0, sc = 1;
		for(int i = 1; i<=str.length(); i++) {
			if(str.substring(i-1, i).equals("O")) {
				sum += sc;
				sc++;
			}
			else {
				sc = 1;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		String[] str = new String[n];
		
		for(int i=0; i<str.length; i++) {
			str[i] = scr.next();
		}
		for(int i=0; i<str.length; i++) {
			sum(str[i]);
		}
		
		scr.close();

	}

}
