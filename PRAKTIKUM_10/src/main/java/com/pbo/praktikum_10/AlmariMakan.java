/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.praktikum_10;

/**
 *
 * @author Acer
 */
public class AlmariMakan extends Almari implements Discountable{
    int jmlRoda;
    float diskon = 0.15f;
    @Override
    public void discount(int harga){
        System.out.println("Harga sebelum diskon : "+harga);
        System.out.println("Harga setelah diskon : "+(harga-(harga * diskon)));
    }
}