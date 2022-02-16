/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkap_4;

/**
 *
 * @author MOKLET-1
 */
public class UjiBus3 
{
    public static void main(String[] abc){
   Bus3 busMini=new Bus3 (10);
        busMini.getPassword(40);
        busMini.getPassword(90);
        busMini.cetak();

        busMini.pluspenumpang(2);
        busMini.cetak();
        
        busMini.pluspenumpang(1);
        busMini.cetak();
        
        busMini.pluspenumpang(2);
        busMini.cetak();
        
        busMini.pluspenumpang(2);
        busMini.cetak();

    }
}
