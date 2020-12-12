package Ch07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		System.out.println("** 포인트 관리 프로그램입니다 **");
		int point;
		while(true) {
			String name = sc.next();
			if(name.equals("exit"))
				break;
			point = sc.nextInt();
			if(hm.containsKey(name))
				hm.put(name, hm.get(name)+point);
			else
				hm.put(name, point);
			Set<String> Keys = hm.keySet();
			Iterator<String> it = Keys.iterator();
			while(it.hasNext()) {
				String key = it.next();
				Integer value = hm.get(key);
			System.out.print("("+key+","+value+")");
			}
			System.out.println();
		}
		
	}

}
