package baekjoon;
import java.util.Scanner;

public class baekjoon1193 {
	
	static int sum(int c) {
		if(c == 1)
			return 1;
		return c+sum(c-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int s = 1,c = 0;
		int i, j, temp = n; //i�� ����, j�� �и�
		
		while(temp > 0) {
			temp = temp-s;
			c++;
			s++;
		}
		if(n != 1)
			n = n - sum(c-1);
		
		if(c % 2 == 1) { //����(i)�� ���� ū ���
			i = c;
			j = 1;
		}
		else { //�и�(j)�� ���� ū ���
			i = 1;
			j = c;
		}
		
		while(n != 1) {
			if(c % 2 == 1) {
				i--;
				j++;
			}
			else {
				i++;
				j--;
			}
			n--;
		}
		
		System.out.println(i+"/"+j);
		
		scr.close();

	}

}
