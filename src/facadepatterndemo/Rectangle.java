/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadepatterndemo;

/**
 *
 * @author sujiitramurukeshan
 */
// Rectangle class implents the interface Shape
public class Rectangle implements Shape{
     //draw method is overriden
    @Override
    public int draw(){
        System.out.println("Rectangle::draw()"); //Prints the shape
        return 2; // returns an interger 2
    }
    
}
