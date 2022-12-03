package while_for;

public class WhileDemo {

	public static void main(String[] args) {
		int x = 5;
		int y = 0;

		while (x <= 35) {
			y= x + 20;

			System.out.println("x=" + x);		  
			System.out.println("y=" + y);
			System.out.println("");

			x = x + 5;

			// x+=5;
			// x = x +1; 
			// x++;
		}
	}
}
