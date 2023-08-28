/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pbo.praktikum_10;

/**
 *
 * @author Acer
 */
public interface IntAC {
    public static final int KeadaanHidup = 1;
    public static final int KeadaanMati = 0;
    public static final String dingin = "Dingin";
    public static final String sejuk = "Sejuk";
    public static final String panas = "Panas";
    
    public abstract void hidupkan();
    public abstract void matikan();
    public abstract void rubahSuhu(String suhu);
}
