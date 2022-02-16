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
public class Class2 extends Class1{
    String nama;
    int nomor = 333333;
    String kelamin = "Perempuan";
    
    public void setnama(String nama){
        this.nama=nama;
    }
    public void Cetak(){
        super.pegawai();
        System.out.println("Nama = "+nama);
        System.out.println("Jenis Kelamin = "+kelamin);
        System.out.println("Nomor pegawai "+nomor);
        super.kerja();
        
        Class1 gaji = new Class1();
        gaji.gaji(1200000);
        gaji.gaji(1200000, 1200000);
        
    }
}
