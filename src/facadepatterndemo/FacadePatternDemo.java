/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facadepatterndemo;

/**
 *
 * @author sujiitramurukeshan
 */
public class FacadePatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeMaker shapeMaker= new ShapeMaker(); //Object is created
        shapeMaker.drawRectangle();
        shapeMaker.drawCircle();
        shapeMaker.drawSquare();
        
    }
    
}
