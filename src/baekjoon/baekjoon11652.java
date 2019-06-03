package baekjoon;
import java.util.Scanner;

public class baekjoon11652 {
	
	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int num[] = new int[n]; //n개의 정수 배열
		int min, minIndex;
		
		for(int i=0; i<n; i++) {
			num[i] = scr.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			min = num[i];
			minIndex = i;
			for(int j=i; j<n; j++) {
				if(min > num[j]) {
					min = num[j];
					minIndex = j;
				}
			}
			swap(num, i, minIndex);
		}

		int max = 0, maxIndex = 0, bfIndex = 0;
		for(int i=0; i<n-1; i++) {
			if(num[i] != num[i+1]) {
				if(max == 0) {
					max = i+1;
				    maxIndex = i;
				    bfIndex = i;
				}
				else if(max < i-bfIndex){
					max = i-max+1;
					maxIndex = i;
					bfIndex = i;
				}
				else
					bfIndex = i;
			}
		}
		
		System.out.print(num[maxIndex]);
		scr.close();

	}

}