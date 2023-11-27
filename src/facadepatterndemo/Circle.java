/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package facadepatterndemo;

/**
 *
 * @author sujiitramurukeshan
 * Circle class implements the interface Shape
 * draw method is overriden
 * returns an integer 1
 * Prints the shape circle
 */


public class Circle implements Shape{
     
     
    @Override
    public int draw(){
         
        System.out.println("Circle::draw()"); 
        
        return 1; 
    }
    
}
