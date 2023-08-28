/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.praktikum_10;

/**
 *
 * @author Acer
 */
public class TestAC {
    public static void main(String[] args){
        AC acKamar = new AC();
        System.out.println("Status AC saat ini : Mati");
        acKamar.hidupkan(); // AC Hidup
        acKamar.hidupkan(); // AC sudah hidup kok
        acKamar.matikan(); // AC Mati
        acKamar.matikan(); // AC sudah mati kok
        acKamar.hidupkan(); // AC Hidup
        acKamar.rubahSuhu(AC.panas);
        acKamar.rubahSuhu(AC.dingin);
        acKamar.rubahSuhu(AC.sejuk);
        acKamar.rubahSuhu(AC.panas);
        acKamar.rubahSuhu(AC.panas);
        acKamar.rubahSuhu(AC.dingin);
        acKamar.rubahSuhu(AC.sejuk);
        acKamar.rubahSuhu(AC.dingin);
        acKamar.rubahSuhu(AC.dingin);
        acKamar.rubahSuhu(AC.panas);
        acKamar.matikan(); // AC Mati
    }
}
