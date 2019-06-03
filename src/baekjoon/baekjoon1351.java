package baekjoon;
import java.util.Scanner;

public class baekjoon1351 {

	static void find(int n, int p, int q) {
		int[] a = new int[n+1];
		a[0] = 1;
		int i = 1;
		
		if(n == 0)
			System.out.println(a[0]);
		else {
			while(i <= n) {
				a[i] = a[i/p]+a[i/q];
				if(i == n) {
					System.out.println(a[i]);
				}
				i++;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int p = scr.nextInt();
		int q = scr.nextInt();
		
		find(n,p,q);
		scr.close();

	}

}
