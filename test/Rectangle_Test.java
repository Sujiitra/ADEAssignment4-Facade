/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import facadepatterndemo.Rectangle;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sujiitramurukeshan
 */
public class Rectangle_Test {
    
    public Rectangle_Test() {
    }

     //Creates an object to the Rectangle class
    Rectangle r=new Rectangle();
    @Test
     public void draw_test() {
     assertEquals(2,r.draw()); // when the method is called, it returns 2
     assertNotEquals(3,r.draw()); // when the method is called, it will not return 3
     assertNotNull(r.draw()); // when the method is called, it never returns a null value
     }
}
