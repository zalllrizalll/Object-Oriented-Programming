/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.praktikum_10;

/**
 *
 * @author Acer
 */
public class Handphone extends Telepon implements Kamera, Radio{
    private String gelombang;
    private float pixel;
    @Override
    public void ambilGambar(){ // Implementation method interface Kamera
        System.out.println("Gambar terambil...");
    }
    @Override
    public void setGelombang(String gel){ // Implementation method interface Radio
        this.gelombang = gel;
    }
    @Override
    public void setPixel(float pixel){ // Implementation method interface Kamera
        this.pixel = pixel;
    }
    public void setNomor(long no){ 
        this.nomer = no; // Implementation attribut class Telepon yaitu attribut nomer
    }
}