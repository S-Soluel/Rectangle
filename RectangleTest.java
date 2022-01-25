
public class RectangleTest {

	public static void main(String[] args) {
	Rectangle r1 = new Rectangle(10, 2);
	Rectangle r2 = new Rectangle(70, 200);
	Rectangle r3 = new Rectangle(15.37, 80.0001);
	
	System.out.println(r1.getArea());
	System.out.println(r2.getArea());
	System.out.println(r3.getArea());
	System.out.println("");
	
	r1.setLength(20);
	r1.setWidth(12);
	System.out.println(r1.getArea());
	
	r1.setLength(-10);
	r1.setWidth(-10);
	
	}

}
