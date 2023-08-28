import java.util.Scanner;

public class TemperaturDemo {
    static int operator;
    public static void main(String[] args) {
        Temperatur suhu = new Temperatur(30);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("========== Konversi Suhu With Constructor ==========");
            printTemperatur(1);
            printTemperatur(2);
            printTemperatur(3);
            printTemperatur(4);
            printTemperatur(5);
            printTemperatur(6);
            printTemperatur(7);
            System.out.println("\n========== Konversi Suhu With Scanner ==========");
            System.out.print("Inputkan Suhu Celcius\t : "); Temperatur.celcius = sc.nextFloat();
            System.out.print("Inputkan Konversi Suhu\t : "); operator = sc.nextInt();
            printTemperatur(operator);
        }
    }
    public static void printTemperatur(int operator){
        switch(operator){
            case 1:
                System.out.println("Celcius to Kelvin\t : "+Temperatur.celcius_to_kelvin());
                break;
            case 2:
                System.out.println("Celcius to Fahrenheit\t : "+Temperatur.celcius_to_fahrenheit());
                break;
            case 3:
                System.out.println("Celcius to Rankine\t : "+Temperatur.celcius_to_rankine());
                break;
            case 4:
                System.out.println("Celcius to Delisle\t : "+Temperatur.celcius_to_delisle());
                break;
            case 5:
                System.out.println("Celcius to Newton\t : "+Temperatur.celcius_to_newton());
                break;
            case 6:
                System.out.println("Celcius to Reaumur\t : "+Temperatur.celcius_to_reaumur());
                break;
            case 7:
                System.out.println("Celcius to Romer\t : "+Temperatur.celcius_to_romer());
                break;
            default:
                System.out.println("404 Not Found");
                break;
        }
    }
}
