/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        shape s1 = new circle(7);
        shape s2 = new rectangle(5, 10);

        drawable d1 = (drawable) s1;
        drawable d2 = (drawable) s2;

        System.out.println("luas lingkaran: " + s1.getArea());
        d1.draw();

        System.out.println("luas persegi panjang: " + s2.getArea());
        d2.draw();
    }
}
