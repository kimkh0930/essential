package Ch07;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Vector v= new Vector(); 
		for (int i = 0; i < 5; i++) {
			v.add(sc.nextDouble());
		}

		double b = (double) v.get(0);
		for (int i = 1; i < v.size(); i++) {
			if(b<(double)v.get(i))
				b=(double)v.get(i);
		}
		System.out.println(b);
	}

}
