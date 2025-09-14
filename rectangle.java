/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

/**
 *
 * @author Admin
 */
class rectangle extends shape implements drawable {
    double width, height;

    rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("menggambar persegi panjang dengan ukuran " + width + " x " + height);
    }
}
