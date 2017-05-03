/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.exercise2;

import javax.swing.JOptionPane;

/**
 *
 * @author mitchell
 */
public class RedShapeDecorator extends ShapeDecorator {
    
    public RedShapeDecorator(Shape shapeToBeDecorator) {
        super(shapeToBeDecorator);
    }
    
    public void draw(){
        
    System.out.println("Border Color: Red");
    
 //   super.draw();
 //   addRedBorder();
    };

//    private void addRedBorder() {
//        System.out.println("Border Color: Red");
//    }
    
          
   }

    
    
    

