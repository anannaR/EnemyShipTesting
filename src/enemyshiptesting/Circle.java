/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapetesting;

/**
 *
 * @author user
 */
public class Circle extends TwoDShap {
    public Circle(double x){
       /* super.setX(x);
        super.area(x);*/
        super(x,0);
    }
    public void area(){
        double a= 3.14*getd1()*getd1();
        System.out.println("area of circle "+a);
        
    }
    
    
}
