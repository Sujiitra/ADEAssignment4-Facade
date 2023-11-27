/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadepatterndemo;

/**
 *
 * @author sujiitramurukeshan
 */
/*Circle class implents the interface Shape*/

public class Circle implements Shape{
     
     /*draw method is overriden*/
    @Override
    public int draw(){
         
        System.out.println("Circle::draw()"); /*Prints the shape circle*/
        return 1; /* returns an interger 1*/
    }
    
}
