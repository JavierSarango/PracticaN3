/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MemoriaMejorada;

import java.util.Scanner;

/**
 *
 * @author Gigabyte
 */
public class MemoriaMejora {

    /**
     *
     * @author darkangel
     */
    public final static int OVERFLOW = 200000000;
    private String salida;
    private int tamanio;
    String tempOOM = "";
    
    public MemoriaMejora(int leng) {
        this.tamanio = leng;
        int i = 0;

        for (i=0; i < leng; i++) {
            try {
                this.salida += "a";
                
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
                break;
            }
        }
        this.salida = tempOOM;
        
    }
    
    public String getOom() {
        return salida;
    }
    
    public int getLength() {
        return tamanio;
    }
    
    public static void main(String[] args) {
        MemoriaMejora javaHeapTest = new MemoriaMejora(OVERFLOW);
        System.out.println(javaHeapTest.getOom().length());
        Scanner sc = new Scanner(System.in);
        System.out.println("precione cualquier numero");
        sc.nextInt();
    }
}
