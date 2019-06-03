package baekjoon;
import java.util.Scanner;

public class baekjoon2851 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int num[] = new int[10];
		int sum = 0, temp = 0;
		for(int i=0; i<num.length; i++) {
			num[i] = scr.nextInt();
			temp += num[i];
			
			if(temp <= 100) {
				sum += num[i];
			}
			else if((100-sum)>=(temp-100)) {
				sum = temp;
			}
			
		}
		System.out.print(sum);
		scr.close();

	}

}
