/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facadepatterndemo;

/**
 *
 * @author sujiitramurukeshan
 * Main method,
 * Object is created,
 * calls the shape maker
 */

public class FacadePatternDemo {

    /**
     * @param args the command line arguments
     */
    /*Main method */
    public static void main(String[] args) {
        
        ShapeMaker shapeMaker= new ShapeMaker(); /*Object is created*/
        shapeMaker.drawRectangle(); /*calls the shape maker*/
        shapeMaker.drawCircle(); /*calls the shape maker*/
        shapeMaker.drawSquare(); /*calls the shape maker*/
        
    }
    
}
