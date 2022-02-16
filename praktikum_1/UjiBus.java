/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum_1;

/**
 *
 * @author MOKLET-1
 */
public class UjiBus {
    public static void main(String[] args) {
      Bus busMini=new Bus (10);
        busMini.getPassword(40);
        busMini.getPassword(90);
        busMini.cetak();
        
        busMini.addPenumpang(3);
        busMini.cetak();
        busMini.addPenumpang(1);
        busMini.cetak();
        busMini.addPenumpang(1);
        busMini.cetak();

        System.out.println("Rata-rata Penumpang : "+busMini.getAverage());
    }
}
