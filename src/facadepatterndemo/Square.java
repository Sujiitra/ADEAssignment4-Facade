/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadepatterndemo;

/**
 *
 * @author sujiitramurukeshan
 */
public class Square implements Shape{
     @Override
    public int draw(){
        System.out.println("Square::draw()"); //Prints the shape
        return 3;
    }
    
}
