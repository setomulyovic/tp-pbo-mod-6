/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.pkg6;

/**
 *
 * @author DELL
 */

public class Circle implements Shape {
    private double radius;
    double pi = Math.PI;

    public Circle() {
        this(1);
    }   
    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        // A = π r^2
        return pi * radius * radius;
    }

}
    
