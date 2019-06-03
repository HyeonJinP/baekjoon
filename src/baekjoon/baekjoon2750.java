package baekjoon;
import java.util.Scanner;

public class baekjoon2750 {
	
	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static void sort(int[] a) {
		for(int i=0; i<a.length-1; i++) {
			for(int j=0; j<a.length-1; j++) {
				if(a[j] > a[j+1]) {
					swap(a,j,j+1);
				}
			}
		}
	}
	
	static void print_sort(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int cnt = scr.nextInt();
		int[] a = new int[cnt];
		
		for(int i=0; i<cnt; i++) {
			a[i] = scr.nextInt();
		}
		
		sort(a);
		print_sort(a);
		scr.close();

	}

}
