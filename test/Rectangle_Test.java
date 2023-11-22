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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    Rectangle r=new Rectangle();
    @Test
     public void draw_test() {
     assertEquals(2,r.draw());
     assertNotEquals(3,r.draw());
     assertNotNull(r.draw());
     }
}
