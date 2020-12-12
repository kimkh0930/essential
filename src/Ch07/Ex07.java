package Ch07;

import java.util.ArrayList;
import java.util.Scanner;


class Location{
	private int x,y;
public Location(int x, int y) {
	this.x=x;
	this.y=y;
}
public int getX() {
	return x;
}
public int getY() {
	return y;
}
}
public class Ex07 {

	
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Location> a = new ArrayList();
		double xdis;
		double ydis;
		double dis=0;
		a.add(new Location(0, 0));
		System.out.println("쥐가 이동한 위치(x,y)를 5개 입력하라.");
		for (int i = 1; i <= 5; i++) {
			a.add(new Location(sc.nextInt(),sc.nextInt()));
		}
		a.add(new Location(0, 0));
		
		for (int j = 1; j <=6; j++) {
			
			Location l1 = (Location) a.get(j-1);
			Location l2 = (Location) a.get(j);
			xdis= Math.pow(l2.getX()-l1.getX(),2);
			ydis= Math.pow(l2.getY()-l1.getY(),2);
			if(j==6) {
			xdis= Math.pow(l1.getX()-0,2);
			ydis= Math.pow(l1.getY()-0,2);}
			dis += Math.sqrt((xdis+ydis));
		}
		
		System.out.println("총 이동거리는 "+dis);
	}

}
