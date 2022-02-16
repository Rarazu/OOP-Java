/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan_2;

/**
 *
 * @author MOKLET-1
 */
 abstract class Main{
    public static void main(String[] args){
    Line garis1 = new Line (1,2,3,4);
    Line garis2 = new Line (1,2,3,4);
    garis1.getLength();
    garis2.getLength();

    System.out.println("garis1 > garis2 = "+garis1.isGreater(garis1,garis2));
    System.out.println("garis1 < garis2 = "+garis1.isLess(garis1,garis2));
    System.out.println("garis1 == garis2 = "+garis1.isEqual(garis1,garis2));
    }
}
