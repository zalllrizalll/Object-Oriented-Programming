/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.praktikum_10;

/**
 *
 * @author Acer
 */
public class DemoMebel {
    public static void main(String[] args){
        // Test Almari Makan
        System.out.println("---------- Almari Makan ----------");
        AlmariMakan almariMakan = new AlmariMakan();
        almariMakan.roda = true;
        almariMakan.jmlRoda = 4;
        almariMakan.bahan = "Jati";
        almariMakan.harga = 2000000;
        System.out.println("Harga\t : "+almariMakan.harga);
        System.out.println("Bahan\t : "+almariMakan.bahan);
        System.out.println("Roda\t : "+almariMakan.jmlRoda);
        almariMakan.discount(almariMakan.harga);
        System.out.println("Bayar\t : "+(almariMakan.harga - (almariMakan.harga * almariMakan.diskon)));
        System.out.println("----------------------------------");
        
        // Test Almari Pakaian
        System.out.println("---------- Almari Pakaian ----------");
        AlmariPakaian almariPakaian = new AlmariPakaian();
        almariPakaian.roda = false;
        almariPakaian.jmlPintu = 3;
        almariPakaian.bahan = "Stainless Steel";
        almariPakaian.harga = 2500000;
        System.out.println("Harga\t : "+almariPakaian.harga);
        System.out.println("Bahan\t : "+almariPakaian.bahan);
        System.out.println("Jumlah Pintu : "+almariPakaian.jmlPintu);
        almariPakaian.discount(almariPakaian.harga);
        System.out.println("Bayar : "+(almariPakaian.harga - (almariPakaian.harga * almariPakaian.diskon)));
        System.out.println("------------------------------------");
        
        // Test Meja Makan
        System.out.println("---------- Meja Makan ----------");
        MejaMakan mejaMakan = new MejaMakan();
        mejaMakan.jmlKursi = 6;
        mejaMakan.jmlKaki = 4;
        mejaMakan.harga = 2000000;
        mejaMakan.bahan = "Jati";
        System.out.println("Harga\t\t : "+mejaMakan.harga);
        System.out.println("Bahan\t\t : "+mejaMakan.bahan);
        System.out.println("Jumlah kursi\t : "+mejaMakan.jmlKursi);
        System.out.println("Jumlah Kaki\t : "+mejaMakan.jmlKaki);
        System.out.println("Bayar\t\t : "+mejaMakan.harga);
        System.out.println("--------------------------------");
        
        // Test Meja Tamu
        System.out.println("---------- Meja Tamu ----------");
        MejaTamu mejaTamu = new MejaTamu();
        mejaTamu.bentukKaca = "Rectangle";
        mejaTamu.jmlKaki = 4;
        mejaTamu.harga = 3500000;
        mejaTamu.bahan = "Jati";
        System.out.println("Harga\t : "+mejaTamu.harga);
        System.out.println("Bahan\t : "+mejaTamu.bahan);
        System.out.println("Bentuk Kaca : "+ mejaTamu.bentukKaca);
        System.out.println("Jumlah Kaki : "+mejaTamu.jmlKaki);
        mejaTamu.discount(mejaTamu.harga);
        System.out.println("Bayar : "+(mejaTamu.harga - (mejaTamu.harga * mejaTamu.diskon)));
        System.out.println("--------------------------------");
    }
}
