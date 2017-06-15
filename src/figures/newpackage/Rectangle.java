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
public class Rectangle extends AbsFigure {

    private int side_a;
    private int side_b;

    public int getSide_a() {
        return side_a;
    }

    public void setSide_a(int side_a) {
        this.side_a = side_a;
    }

    public int getSide_b() {
        return side_b;
    }

    public void setSide_b(int side_b) {
        this.side_b = side_b;
    }

    public Rectangle(int side_a, int side_b) {
        this.side_a = side_a;
        this.side_b = side_b;
    }

    @Override
    public void perimetr() {
        double perim = 2 * (side_a + side_b);
        System.out.println("Perimetr = " + perim);
    }

    @Override
    public void square() {
        int squar = side_a * side_b;
        System.out.println("Square = " + squar);
    }

    @Override
    public void figureInfo() {
        perimetr();
        square();
    }

}
