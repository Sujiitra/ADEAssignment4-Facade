/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import facadepatterndemo.Square;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sujiitramurukeshan
 */
/*Test Class for the Square*/
public class Square_Test {
    
    public Square_Test() {
    }

    /*Creates an object to the Square class*/
    Square s=new Square();
    @Test
    public void draw_test() {
    assertEquals(3,s.draw()); /* when the method is called, it returns 3*/
    assertNotEquals(1,s.draw()); /* when the method is called, it will not return 1*/
    assertNotNull(s.draw()); /* when the method is called, it never returns a null value*/
    }
}
