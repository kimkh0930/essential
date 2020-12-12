package Ch07;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> a= new ArrayList();
		String s;
		System.out.printf("빈 칸으로 분리하여 5개의 학점을 입력(A/B/C/D/F)>>");
		for (int i = 0; i < 5; i++) {
			s = sc.next();
			char c = s.charAt(0);
			a.add(c);
		}
		for (int i = 0; i < a.size(); i++) {
			a.get(i);
			if(a.get(i)=='A')
				System.out.printf(4.0+" ");
			if(a.get(i)=='B')
				System.out.printf(3.0+" ");
			if(a.get(i)=='C')
				System.out.printf(2.0+" ");
			if(a.get(i)=='D')
				System.out.printf(1.0+" ");
			if(a.get(i)=='F')
				System.out.printf(0.0+" ");
		}
		
	}

}
