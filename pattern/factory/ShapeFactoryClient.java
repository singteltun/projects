public class ShapeFactoryClient {

  public static void main(String[] args) {
    ShapeFactory factory = new ShapeFactory();
    
    Circle circle = (Circle)factory.getShape("CIRCLE");
    circle.draw();
 
    Rectangle rectangle = (Rectangle)factory.getShape("RECTANGLE");
    rectangle.draw();
 
    Square square = (Square)factory.getShape("SQUARE");
    square.draw();
 
  }

}
