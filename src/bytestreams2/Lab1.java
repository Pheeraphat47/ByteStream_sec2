/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bytestreams2;


public class Lab1 {

    public static void main(String[] args) {
       Circle c = new Circle();
       RedShapeDecorator redCircle = new RedShapeDecorator(c);       
       redCircle.draw();
       
       Rectangle r = new Rectangle();
       RedShapeDecorator redRectangle = new RedShapeDecorator(r);
       redRectangle.draw();
    }
    
}
