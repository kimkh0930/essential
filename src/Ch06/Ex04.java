package Ch06;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str,"+");
		
		
		int sum=0;
		while(st.hasMoreTokens()) {
			String n = st.nextToken();
			String s = n.trim();
			sum+=Integer.parseInt(s);
		}
		System.out.println("гую╨ "+sum);
	}

}
