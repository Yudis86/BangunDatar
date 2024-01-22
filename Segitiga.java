/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangundatar;

/**
 *
 * @author yudistira
 */
public class Segitiga {
    float alas;
    float tinggi;
    
        float luas() {
        float luas = 1/2 * (alas * tinggi);
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    }      
    
        float keliling() {
        float keliling =alas + tinggi*2;
        System.out.println("Keliling Segitiga: " + keliling);
        return keliling;
    }    
}
    

