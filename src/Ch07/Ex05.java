package Ch07;

import java.util.HashMap;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		int top=0;
		String name,big = null;
		int people;
		System.out.println("���� �̸��� �α��� 5�� �Է��ϼ���.(��: Korea 5000)");
		for (int i = 0; i < 5; i++) {
			name =sc.next();
			people = sc.nextInt();
			nations.put(name, people);
			if(top<nations.get(name)) {
				top=nations.get(name);
				big=name;
			}
		}
		System.out.println("���� �α��� ���� ����� ("+big+","+top+")");
		
	}

}
