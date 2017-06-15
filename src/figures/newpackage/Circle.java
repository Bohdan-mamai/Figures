/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figures.newpackage;

/**
 *
 * @author Богдан
 */
public class Circle extends AbsFigure {

    private int radius;
    static double p = 3.14;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void perimetr() {
        double perim = 2 * radius * p;
        System.out.println("Perimetr = " + perim);
    }

    @Override
    public void square() {
        double squar = 2 * p * (radius * radius);
        System.out.println("Square = " + squar);
    }

    @Override
    public void figureInfo() {
        perimetr();
        square();
    }

}
