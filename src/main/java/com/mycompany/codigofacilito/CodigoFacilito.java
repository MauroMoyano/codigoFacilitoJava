/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.codigofacilito;

/**
 *
 * @author mauromoyanodev
 */
public class CodigoFacilito {

    public static void main(String[] args) {
        /*
            int calificacion = 3;
        
        if(calificacion < 70){
            System.out.print("Reprobado");
        }else{
            System.out.print("Aprobado");
        }
        */
        
        // dos();
        tres();
    }
    
    public static void dos(){
        int uno = 9,dos = 50,tres = 4;
        int mayor, menor;
        if(uno > dos){
            mayor = uno;
            menor = dos;
        }else{
            mayor = dos;
            menor = uno;
        }
        if(mayor < tres){
            System.out.println(menor + ", "+ mayor + ", " + tres);
        }else if(tres < menor){
            System.out.println(tres + ", "+ menor + ", " + mayor);
        }else{
                        System.out.println(menor + ", "+ tres + ", " + mayor);

        }
    }
    
    public static void tres(){
        for(int num = 9, i = 1; i <= 10 ; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
    
}
