import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args){

        Scanner teclado_numero=new Scanner (System.in);

        System.out.print("Ingrese numero: ");
        int numero=teclado_numero.nextInt();

        int n1=numero/100;
        int n2=(numero - (n1*100))/10;
        int n3=(numero - (n1*100) - (n2*10));

        if (n1==1 && n2==0 && n3==0) {
            System.out.print("CIEN ");

        } else if (n1==1) {
            System.out.print("CIENTO ");
        
        } else if (n1==2) {
            System.out.print("DOCIENTOS ");

        } else if (n1==3) {
            System.out.print("TRECIENTOS ");

        } else if (n1==4) {
            System.out.print("CUATROCIENTOS ");

        } else if (n1==5) {
            System.out.print("QUINIENTOS ");

        } else if (n1==6) {
            System.out.print("SEISCIENTOS ");

        } else if (n1==7) {
            System.out.print("SETENCIENTOS ");

        } else if (n1==8) {
            System.out.print("OCHOCIENTOS ");    

        } else if (n1==9) {
            System.out.print("NOVECIENTOS "); 

        } else if (n1==0) {
            System.out.print("");           
        }


        if (n2==0){
            System.out.print("");

        } else if (n2==1 & n3==0) {
            System.out.print("DIEZ "); 

        } else if (n2==1 & n3==1) {
            System.out.print("ONCE ");

        } else if (n2==1 & n3==2) {
            System.out.print("DOCE ");

        } else if (n2==1 & n3==3) {
            System.out.print("TRECE ");

        } else if (n2==1 & n3==4) {
            System.out.print("CATORCE ");

        } else if (n2==1 & n3==5) {
            System.out.print("QUINCE ");
            
        } else if (n2==1) {
            System.out.print("DIEZ Y ");

        } else if (n2==2 & n3==0){
            System.out.print("VEINTE");

        } else if (n2==2) {
            System.out.print("VEINTI Y ");
        
        } else if (n2==3 & n3==0){
            System.out.print("TREINTA");

        } else if (n2==3) {
            System.out.print("TREINTA Y ");

        } else if (n2==4 & n3==0){
            System.out.print("CUARENTA");

        } else if (n2==4) {
            System.out.print("CUARENTA Y ");

        } else if (n2==5 & n3==0){
            System.out.print("CINCUENTA");

        } else if (n2==5) {
            System.out.print("CINCUENTA Y ");

        } else if (n2==6 & n3==0){
            System.out.print("SESENTA");

        } else if (n2==6) {
            System.out.print("SESENTA Y ");

        } else if (n2==7 & n3==0){
            System.out.print("SETENTA");

        } else if (n2==7) {
            System.out.print("SETENTA Y ");

        } else if (n2==8 & n3==0){
            System.out.print("OCHENTA");

        } else if (n2==8) {
            System.out.print("OCHENTA Y ");

        } else if (n2==9 & n3==0){
            System.out.print("NOVENTA");

        } else if (n2==9) {
            System.out.print("NOVENTA Y ");
        }
                                              

        if (n1==0 & n2==0 & n3==0){
            System.out.print("CERO");
        
        }else if (n2==0 | n2==2 | n2==3 | n2==4 | n2==5 | n2==6 | n2==7 | n2==8 | n2==9 && n3==1) {
            System.out.print("UNO ");

        } else if (n2==0 | n2==2 | n2==3 | n2==4 | n2==5 | n2==6 | n2==7 | n2==8 | n2==9 && n3==2) {
            System.out.print("DOS ");

        } else if (n2==0 | n2==2 | n2==3 | n2==4 | n2==5 | n2==6 | n2==7 | n2==8 | n2==9 && n3==3) {
            System.out.print("TRES ");

        } else if (n2==0 | n2==2 | n2==3 | n2==4 | n2==5 | n2==6 | n2==7 | n2==8 | n2==9 && n3==4) {
            System.out.print("CUATRO ");

        } else if (n2==0 | n2==2 | n2==3 | n2==4 | n2==5 | n2==6 | n2==7 | n2==8 | n2==9 && n3==5) {
            System.out.print("CINCO ");      
        }


        if (n3==6) {
            System.out.print("SEIS ");

        } else if (n3==7) {
            System.out.print("SIETE ");

        } else if (n3==8) {
            System.out.print("OCHO ");

        } else if (n3==9) {
            System.out.print("NUEVE ");

        }
    }
}