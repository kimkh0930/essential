package Ch06;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = "";
		String cstr = "";
		while(true) {
			System.out.println("����(1), ����(2), ��(3), ������(4)>>");
			int i =sc.nextInt();
			if(i==4)
				break;
			if(i==1)
				str="����";
			else if(i==2)
				str="����";
			else if(i==3)
				str="��";
			
			int com = (int)(Math.random()*3)+1;
			if(com==1)
				cstr="����";
			else if(com==2)
				cstr="����";
			else if(com==3)
				cstr="��";
		
			System.out.println("����� "+str+": " +"��ǻ�� "+":"+cstr);
			if(i==com+1||i==com-2)
				System.out.println("����ڰ� �̰���ϴ�.");
			if(com==i+1||com==i-2)
				System.out.println("����ڰ� �����ϴ�.");
			if(com==i)
				System.out.println("�����ϴ�.");
			
		}
		
	}

}
