/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pbo.praktikum_10;

/**
 *
 * @author Acer
 */
interface IntLampu {
    public static final int KeadaanHidup = 1;
    public static final int KeadaanMati = 0;
    
    public abstract void hidupkan();
    public abstract void matikan();
}
