package baekjoon;
import java.util.Scanner;

public class baekjoon10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int x = scr.nextInt();
		int a[] = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = scr.nextInt();
		}
		for(int i=0; i<n; i++) {
			if(a[i] < x) { 
				System.out.print(a[i]+" ");
			}
		}
		scr.close();

	}

}
