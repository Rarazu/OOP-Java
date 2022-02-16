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
class Buku extends Perpus{
     private String b;
    public void setBuku (String judul){
        b = judul;
    }
    public String getBuku(){
        return b;
    }
    public void tampilkanJudul(){
        super.tampilkanJudul();
        System.out.println("Judul b : "+getBuku());
    }
}
