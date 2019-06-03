package baekjoon;
import java.util.Scanner;

public class baekjoon10817 {

	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int a[] = new int[3];
		for(int i=0; i<a.length; i++) {
			a[i] = scr.nextInt();
		}
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j<a.length-1; j++) {
				if(a[j] > a[j+1]) {
					swap(a,j,j+1);
				}
			}
		}
		
		System.out.println(a[1]);
		
		scr.close();

	}

}
