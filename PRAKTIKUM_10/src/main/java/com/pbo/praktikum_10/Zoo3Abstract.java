/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.praktikum_10;

/**
 *
 * @author Acer
 */
public class Zoo3Abstract {
    static void test(Binatang a){
        a.makan();
        a.tidur();
        a.mati();
    }
    public static void main(String[] args){
        Harimau macan = new Harimau();
        Bebek donald = new Bebek();
        // Binatang b = new Binatang(); // Error -> Abstract Class tidak dapat dibuat objek
        test(macan);
        test(donald);
    }
}