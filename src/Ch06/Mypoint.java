package Ch06;

public class Mypoint {
	private int x,y;
	public Mypoint(int x,int y){
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "Mypoint"+"("+x+","+y+")"; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mypoint a = new Mypoint(3,20);
		System.out.println(a);
	}

	
}
