package lab.exercise2;


/**
 * @author jlombardo
 */
public class Startup {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Circle with normal border");
        circle.draw();

        Shape rectangle = new Rectangle();
        System.out.println("\nRectangle with normal border");
        rectangle.draw();
        
        // do output for decorated shapes here...
        System.out.println("\nCircle with Red border");
        circle.draw();
        circle = new RedShapeDecorator( circle );
        circle.draw();
        
        
        System.out.println("\nRectangle with Red border");
        rectangle.draw();
        rectangle = new RedShapeDecorator( rectangle );
        rectangle.draw();
        
        
        
        
    }
}
