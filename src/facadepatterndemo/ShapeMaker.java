/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadepatterndemo;

/**
 *
 * @author sujiitramurukeshan
 */
//Facade Pattern Demo
public class ShapeMaker {
    private Shape rectangle;
    private Shape circle;
    private Shape square;
    
    public ShapeMaker(){
        rectangle= new Rectangle();
        circle= new Circle();
        square= new Square();
    }
    
    public void drawRectangle(){
        rectangle.draw(); 
    }
    public void drawCircle(){
        circle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
    
}
