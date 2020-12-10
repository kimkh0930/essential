package Ch06;

import java.util.Scanner;

public class OpenChallenge {
	String readString() {
		StringBuffer sb = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		while(true) {
			String line = sc.nextLine();
			if(line.equals(";"))
				break;
			sb.append(line);
		}
		return sb.toString();
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OpenChallenge op = new OpenChallenge();
		String str = op.readString().toUpperCase();
		
		int count[]= new int[26];
		for (int i = 0; i < str.length(); i++) {
			char n= str.charAt(i);
			if(n>='A'&&n<='Z')
				count[n-'A']++;
		}
		
		for (int k = 65; k < 91; k++) {
			System.out.print((char)k);
			System.out.printf("("+count[k-'A']+")");
			
			for (int j = 0; j < count[k-'A']; j++) {
				System.out.printf("-");
			}
			System.out.println();
		}
}
}