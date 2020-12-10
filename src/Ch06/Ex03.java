package Ch06;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
			int a = (int)(Math.random()*3)+1;
			int b = (int)(Math.random()*3)+1;
			int c = (int)(Math.random()*3)+1;
			System.out.println(a+" "+b+" "+c);
			if(a==b&&b==c) {
				System.out.println("¼º°ø");
				break;
			}
		}
	}

}
