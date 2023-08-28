/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.praktikum_10;

/**
 *
 * @author Acer
 */
public class AC implements IntAC{
    private int statusAC = 0; // dalam keadaan mati
    private String statusSuhu = dingin;
    
    @Override
    public void hidupkan(){
        if(statusAC == KeadaanMati){
            statusAC = KeadaanHidup;
            System.out.println("Hidupkan AC! --> AC hidup");
        } else {
            System.out.println("Hidupkan AC! --> AC sudah hidup kok");
        }
    }
    
    @Override
    public void matikan(){
       if(statusAC == KeadaanHidup){
           statusAC = KeadaanMati;
           System.out.println("Matikan AC! --> AC mati");
       } else {
           System.out.println("Matikan AC! --> AC sudah mati kok");
       }
    }
    
    @Override
    public void rubahSuhu(String suhu){
        switch(suhu){
            case dingin -> {
                if(statusSuhu.equals(panas)){
                    System.out.println("Rubah AC! --> Dingin");
                    System.out.println("Suhu AC! --> AC masih panas, sejukkan dulu");
                } else if(statusSuhu.equals(sejuk)){
                    statusSuhu = dingin;
                    System.out.println("Rubah AC! --> Dingin");
                    System.out.println("Suhu AC! --> AC dingin");
                } else {
                    System.out.println("Rubah AC! --> Dingin");
                    System.out.println("Suhu AC! --> AC sudah dingin, kok didinginkan");
                }
                break;
            }
            case sejuk -> {
                statusSuhu = sejuk;
                System.out.println("Rubah AC! --> Sejuk");
                System.out.println("Suhu AC! --> AC Sejuk");
                break;
            }
            case panas -> {
                if(statusSuhu.equals(dingin)){
                    System.out.println("Rubah Suhu --> Panas");
                    System.out.println("Suhu AC! --> AC masih dingin, sejukkan dulu");
                } else if(statusSuhu.equals(sejuk)){
                    statusSuhu = panas;
                    System.out.println("Rubah Suhu --> Panas");
                    System.out.println("Suhu AC! --> AC Panas");
                } else {
                    System.out.println("Rubah Suhu --> Panas");
                    System.out.println("Suhu AC! --> AC sudah panas, kok dipanaskan");
                }
                break;
            }
        }
    }
}
