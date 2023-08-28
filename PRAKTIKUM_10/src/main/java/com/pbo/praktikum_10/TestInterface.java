/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.praktikum_10;

/**
 *
 * @author Acer
 */
public class TestInterface {
    public static void main(String[] args){
        Lampu lampuKamar = new Lampu();
        System.out.println("Status lampu saat ini : Mati");
        lampuKamar.hidupkan(); // Lampu Hidup
        lampuKamar.matikan(); // Lampu Mati
        lampuKamar.matikan(); // Lampu sudah mati koq 
    }
}
