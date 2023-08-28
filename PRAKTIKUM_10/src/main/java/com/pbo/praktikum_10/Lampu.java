/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.praktikum_10;

/**
 *
 * @author Acer
 */
class Lampu implements IntLampu{
    private int statusLampu = 0;
    
    // Hidupkan
    public void hidupkan(){
        if(statusLampu == KeadaanMati){
            statusLampu = KeadaanHidup;
            System.out.println("Hidupkan Lampu! --> Lampu hidup");
        } else {
            System.out.println("Hidupkan Lampu! --> Lampu sudah hidup koq");
        }
    }
    
    // Matikan
    public void matikan(){
        if(statusLampu == KeadaanHidup){
            statusLampu = KeadaanMati;
            System.out.println("Matikan Lampu! --> Lampu mati");
        } else {
            System.out.println("Matikan Lampu! --> Lampu sudah mati koq");
        }
    }
}
