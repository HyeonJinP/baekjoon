package baekjoon;
import java.util.Scanner;

public class baekjoon2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int t = scr.nextInt(); //�׽�Ʈ ���̽��� ���� t
		String[] s = new String[t]; // ���ڿ� s
		int[] r = new int[t]; // �� �׽�Ʈ ���̽��� �ݺ� Ƚ�� r
		
		for(int i=0; i<t; i++) { // r�� s tȽ����ŭ �Է¹ޱ�
			r[i] = scr.nextInt();
			s[i] = scr.next();
		}
		
		int count = 0; //�ε��� ���� �� ���� �� ��° ���̽����� ��Ÿ��
		while(count < t) {
			for(int i=0; i<s[count].length(); i++) { //���ڿ� ���̸�ŭ �̱�
				for(int j=0; j<r[count];j++) { // r��ŭ �ݺ� ����
					//System.out.print(s[count].substring(i, i+1));
					System.out.print(s[count].charAt(i)); // �� �ε������� �ϳ��� �̱�
				}
			}
			System.out.println();
			count++;
		}
		scr.close();

	}

}
