package baekjoon;
import java.util.Scanner;

public class baekjoon10039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int[] a = new int[5];
		int sum = 0;
		
		for(int i = 0; i<a.length; i++) {
			a[i] = scr.nextInt();
			if(a[i] < 40) {
				a[i] = 40;
			}
			sum += a[i];
		}
		
        System.out.println(sum/5);
		scr.close();

	}

}
