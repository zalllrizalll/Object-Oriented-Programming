/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.praktikum_10;

/**
 *
 * @author Acer
 */
abstract class Binatang { // Abstract Class
    abstract void makan(); // Abstract Method
    abstract void tidur();
    void mati(){
        System.out.println("Mati...");
    }
}