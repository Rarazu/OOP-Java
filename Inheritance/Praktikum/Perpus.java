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
class Perpus {
     private String a;
    public void setPerpus (String nilai){
        a = nilai;
    }
    public String getPerpus(){
        return a;
    }
    public void tampilkanJudul(){
        System.out.println("Judul a : "+getPerpus());
    }
}
