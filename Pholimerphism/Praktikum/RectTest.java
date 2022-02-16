/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author MOKLET-1
 */
public class RectTest {
    public static void main(String[] args){
    Rect hasil = new Rect(1,2,3,4);
    Rect hasil2 = new Rect(0,0,1,2);

        System.out.println(hasil.union(hasil));
        System.out.println(hasil.Intersection(hasil2));
        System.out.println(hasil.isInside(1,2));
        
    }
}
