package Ch06;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = "";
		String cstr = "";
		while(true) {
			System.out.println("가위(1), 바위(2), 보(3), 끝내기(4)>>");
			int i =sc.nextInt();
			if(i==4)
				break;
			if(i==1)
				str="가위";
			else if(i==2)
				str="바위";
			else if(i==3)
				str="보";
			
			int com = (int)(Math.random()*3)+1;
			if(com==1)
				cstr="가위";
			else if(com==2)
				cstr="바위";
			else if(com==3)
				cstr="보";
		
			System.out.println("사용자 "+str+": " +"컴퓨터 "+":"+cstr);
			if(i==com+1||i==com-2)
				System.out.println("사용자가 이겼습니다.");
			if(com==i+1||com==i-2)
				System.out.println("사용자가 졌습니다.");
			if(com==i)
				System.out.println("비겼습니다.");
			
		}
		
	}

}
