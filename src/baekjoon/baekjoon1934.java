package baekjoon;
import java.util.Scanner;

public class baekjoon1934 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();
		int[] a = new int[num];
		int[] b = new int[num];
		
		for(int i=0; i<num; i++) {
			a[i] = scr.nextInt();
			b[i] = scr.nextInt();
		}
		
		for(int i = 0; i<num; i++) {
			int c = (a[i]<b[i])? b[i] : a[i];
			int c1 = c;
			while(true) {
				if(c%a[i]==0 && c%b[i]==0) {
					System.out.println(c);
					break;
				}
				c+=c1;
			}
		}
		
		scr.close();

	}

}
