package baekjoon;
import java.util.Scanner;

public class baekjoon2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int t = scr.nextInt(); //테스트 케이스의 개수 t
		String[] s = new String[t]; // 문자열 s
		int[] r = new int[t]; // 각 테스트 케이스의 반복 횟수 r
		
		for(int i=0; i<t; i++) { // r과 s t횟수만큼 입력받기
			r[i] = scr.nextInt();
			s[i] = scr.next();
		}
		
		int count = 0; //인덱스 역할 및 현재 몇 번째 케이스인지 나타냄
		while(count < t) {
			for(int i=0; i<s[count].length(); i++) { //문자열 길이만큼 뽑기
				for(int j=0; j<r[count];j++) { // r만큼 반복 실행
					//System.out.print(s[count].substring(i, i+1));
					System.out.print(s[count].charAt(i)); // 각 인덱스별로 하나씩 뽑기
				}
			}
			System.out.println();
			count++;
		}
		scr.close();

	}

}
