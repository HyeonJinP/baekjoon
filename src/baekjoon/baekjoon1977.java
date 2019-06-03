package baekjoon;
import java.util.Scanner;

public class baekjoon1977 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int m = scr.nextInt();
		int n = scr.nextInt();
		int sum = 0, min = 1, check = 0;
		
		for(int i = 1; i*i<=n; i++) {
			if(i*i < m) {
				continue;
			}
			if(check == 0) {
				min = i*i;
				check = 1;
			}
			sum += i*i;
		}
		
		if(sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
		
		scr.close();

	}

}
