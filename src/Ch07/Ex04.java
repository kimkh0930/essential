package Ch07;

import java.util.Scanner;
import java.util.Vector;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Double> v = new Vector<Double>();
		System.out.println("2000~2009년까지 1년 단위로 키(cm)입력");
		
		for (int i = 0; i < 10; i++) {
			v.add(sc.nextDouble());
		}
		double height=0;
		int n = 0;
			for (int j = 0; j < v.size()-1; j++) {
				if(height<v.get(j+1)-v.get(j)) {
					height = v.get(j+1)-v.get(j);
					n=j;
				}
			}
		System.out.println("가장 키가 많이 자란 년도는 200"+n+"년 "+height+"cm" );
			
	}

}
