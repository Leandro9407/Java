import java.util.Scanner;

public class Ejercicio17{
    public static void main(String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Digite COP a convertir: ");
        float cop=teclado_numero.nextFloat();

        double usd=cop/3.85715;
        double roundedUsb=Math.round(usd * 100.0)/100.0;
        double eur=cop/4.16138;
        double roundedEur=Math.round(eur * 100.0)/100.0;
        double jpy=cop/25.49;
        double roundedJpy=Math.round(jpy * 100.0)/100.0;
        double gbp=cop/4.87088;
        double roundedGbp=Math.round(gbp * 100.0)/100.0;

        System.out.println("USD: " + roundedUsb);
        System.out.println("EUR: " + roundedEur);
        System.out.println("JPY: " + roundedJpy);
        System.out.println("GBP: " + roundedGbp);

    }
}
