package Ch07;

import java.util.HashMap;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("����������", 2000);
		hm.put("�Ƹ޸�ī��", 2500);
		hm.put("īǪġ��", 3000);
		hm.put("ī���", 3500);
		System.out.println("����������, �Ƹ޸�ī��, īǪġ��, ī��� �ֽ��ϴ�.");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("�ֹ� >> ");
		String str = sc.next();
			if(str.equals("�׸�"))
				break;
			System.out.println(str+"��"+hm.get(str)+"�� �Դϴ�.");
		}
		
	}

}
