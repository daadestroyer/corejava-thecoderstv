
public class ShapeFactory {
	ShapeI getShape(String shape) {
		if (shape.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		} else if (shape.equalsIgnoreCase("square")) {
			return new Square();
		} else if(shape.equalsIgnoreCase("circle")) {
			return new Circle();
		}
		else {
			return null;
		}
	}
}
