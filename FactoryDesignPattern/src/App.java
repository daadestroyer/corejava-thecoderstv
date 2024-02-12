
public class App {
	public static void main(String[] args) {
		ShapeI shape = new ShapeFactory().getShape("sQuare");
		shape.draw();
		
		ShapeI shape2 = new ShapeFactory().getShape("Rectangle");
		shape2.draw();
		
		ShapeI shape3 = new ShapeFactory().getShape("CIRCLE");
		shape3.draw();
	}
}
