/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import facadepatterndemo.Circle;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sujiitramurukeshan
 * Test Class for the circle
 * Creates an object to the circle class
 * Testing is performed here
 * assert equals when the method is called, it returns 1
 * assert not equals when the method is called, it will not return 2
 * assert not null when the method is called, it can never return a null value
 * 
 */
public class Circle_Test {
    
    public Circle_Test() {
    }

   /*Creates an object to the circle class*/
    Circle c= new Circle();
    /*Testing is performed here*/
     @Test
     public void draw_test() {
     assertEquals(1,c.draw()); /* when the method is called, it returns 1*/
     assertNotEquals(2,c.draw()); /* when the method is called, it will not return 2*/
     assertNotNull(c.draw()); /* when the method is called, it can never return a null value*/
     }
}
