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
public class Triangle extends AbsFigure {

    private int side_a;
    private int side_b;
    private int side_c;

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

    public int getSide_c() {
        return side_c;
    }

    public void setSide_c(int side_c) {
        this.side_c = side_c;
    }

    public Triangle(int side_a, int side_b, int side_c) {
        this.side_a = side_a;
        this.side_b = side_b;
        this.side_c = side_c;
    }

    @Override
    public void perimetr() {
        double perim = side_a + side_b + side_c;
        System.out.println("Perimeter = " + perim);
    }

    @Override
    public void square() {
        double p = 0.5 * (side_a + side_b + side_c);
        double square = Math.sqrt(p * (p - side_a) * (p - side_b) * (p - side_c));
        System.out.println("Square = " + square);
    }

    @Override
    public void figureInfo() {
        perimetr();
        square();
    }

    public void show() {
        System.out.printf("%2s %12s", getSide_a(), getSide_b());
    }

}
