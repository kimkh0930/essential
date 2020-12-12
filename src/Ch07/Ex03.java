package Ch07;

import java.util.HashMap;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("에스프레소", 2000);
		hm.put("아메리카노", 2500);
		hm.put("카푸치노", 3000);
		hm.put("카페라떼", 3500);
		System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라떼 있습니다.");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("주문 >> ");
		String str = sc.next();
			if(str.equals("그만"))
				break;
			System.out.println(str+"는"+hm.get(str)+"원 입니다.");
		}
		
	}

}
