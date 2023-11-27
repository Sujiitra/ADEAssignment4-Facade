/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadepatterndemo;

/**
 *
 * @author sujiitramurukeshan
 */
/*Facade Pattern Demo*/
public class ShapeMaker {
    /*Declare private variables*/
    private Shape rectangle;
    private Shape circle;
    private Shape square;
    
    
    public ShapeMaker(){
        rectangle= new Rectangle();/*Creates an instance*/
        circle= new Circle();/*Creates an instance*/
        square= new Square();/*Creates an instance*/
    }
    
    public void drawRectangle(){
        rectangle.draw(); /*calls the draw method from Rectangle class*/
    }
    public void drawCircle(){
        circle.draw(); /*calls the draw method from Circle class*/
    }
    public void drawSquare(){
        square.draw(); /*calls the draw method from Square class*/
    }
    
}
