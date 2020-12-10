package Ch06;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
		String str = sc.nextLine();
		if(str.equals("exit"))
			break;
		StringTokenizer st = new StringTokenizer(str," ");
		int n = st.countTokens();
		System.out.println("어절개수는 "+n);
		}
		
	}

}
