/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figures;

import figures.newpackage.Circle;
import figures.newpackage.Rectangle;
import figures.newpackage.Triangle;
import java.util.Scanner;

/**
 *
 * @author Богдан
 */
public class Figures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input array size: ");
        int n = scan.nextInt();

        System.out.println("Circle: ");
        Triangle ObjTriangle[] = new Triangle[n];

        for (int i = 0; i < n; i++) {
            ObjTriangle[i] = new Triangle(i, i, i);
            ObjTriangle[i].figureInfo();
            System.out.println("- - - - - - -");
        }

        System.out.println("=================");

        System.out.println("Circle: ");
        Circle ObjCircle[] = new Circle[n];

        for (int i = 0; i < n; i++) {
            ObjCircle[i] = new Circle(i);
            ObjCircle[i].figureInfo();
            System.out.println("- - - - - - -");
        }

        System.out.println("=================");

        System.out.println("Rectangle: ");
        Rectangle ObjRectangle[] = new Rectangle[n];

        for (int i = 0; i < n; i++) {
            ObjRectangle[i] = new Rectangle(i, i);
            ObjRectangle[i].figureInfo();
            System.out.println("- - - - - - -");
        }

    }

}
