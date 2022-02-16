/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quis;

/**
 *
 * @author MOKLET-1
 */
public class Class1 {
    
    void pegawai(){
        System.out.println("Berikut Identitas pegawai :");
    }
    void kerja(){
        System.out.println("Bekerja di bagian admin");
    }
   int gaji ;
    void gaji(int a){
        System.out.println("Gaji utama yang didapat "+a);
    }
    void gaji(int a, int tambahan){
        gaji = a + tambahan;
        System.out.println("gaji yang didapat jika bekerja secara baik menjadi "+a);
    }   
}
