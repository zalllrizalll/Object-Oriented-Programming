public class Temperatur {
    static float celcius, kelvin, fahrenheit, rankine, delisle, newton, reaumur, romer;
    // Default Constructor
    public Temperatur(){}
    // Constructor
    public Temperatur(double celcius){
        Temperatur.celcius = (float)celcius;
    }
    // Method Class
    static float celcius_to_kelvin(){
        kelvin = (float)(celcius + 273.15);
        return kelvin;
    }
    static float celcius_to_fahrenheit(){
        fahrenheit = (float)(celcius * 1.8 + 32);
        return fahrenheit;
    }
    static float celcius_to_rankine(){
        rankine = (float)(celcius * 1.8 + 491.67);
        return rankine;
    }
    static float celcius_to_delisle(){
        delisle = (float)((100 - celcius) * 1.5);
        return delisle;
    }
    static float celcius_to_newton(){
        newton = celcius * 33 / 100;
        return newton;
    }
    static float celcius_to_reaumur(){
        reaumur = (float)(celcius * 0.8);
        return reaumur;
    }
    static float celcius_to_romer(){
        romer = (float)(celcius * (21 / 40 + 7.5));
        return romer;
    }
    // Setting Setter and Getter
    void setCelcius(float celcius){
        Temperatur.celcius = celcius;
    }
    float getCelcius(){
        return celcius;
    } 
}
