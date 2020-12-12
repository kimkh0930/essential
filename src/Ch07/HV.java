package Ch07;

import java.util.*;

public class HV {
	public static Vector<String> hastovVector(HashMap<String,String>h){
		Vector<String> v = new Vector<String>();
		Set<String> s = h.keySet();
		Iterator<String> it =s.iterator();
		while(it.hasNext()) {
			String key = it.next();
			v.add(h.get(key));
		}
		return v;
		
	}
	public static void main(String[] args) {
		HashMap<String, String> h = new HashMap<String, String>();
		h.put("����", "112");
		h.put("ȭ��", "119");
		h.put("��ȭ��ȣ", "114");
		Vector<String> v = hastovVector(h);
		for (int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i)+" ");
		}
		
	}

}
