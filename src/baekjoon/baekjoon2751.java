package baekjoon;
import java.util.Scanner;

public class baekjoon2751 {
	
	static void swap(int[] num, int i, int j) {
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;
	}
	
	static void sort(int[] num) {
		for(int i=1; i<num.length; i++) {
			for(int j=1; j<num.length; j++) {
				if(num[j-1] > num[j]) {
					swap(num, j-1, j);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int[] num = new int[n];
		for(int i=0; i<n; i++) {
			num[i] = scr.nextInt();
		}
		
		sort(num);
		
		for(int i=0; i<n; i++) {
			System.out.println(num[i]);
		}
		scr.close();

	}

}
