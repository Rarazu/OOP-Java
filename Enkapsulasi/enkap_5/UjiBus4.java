/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkap_5;

/**
 *
 * @author MOKLET-1
 */
public class UjiBus4 {
 public static void main(String[] abc){
    Bus4 busMini = new Bus4(5) ;
    busMini.getpenumpang(17);
    busMini.getpenumpang(24);
    
    busMini.addpenumpang(2);
    busMini.cetakpenumpang();
    
    busMini.addpenumpang(1);
    busMini.cetakpenumpang();
    
    busMini.addpenumpang(2);
    busMini.cetakpenumpang();
    
    busMini.addpenumpang(2);
    busMini.cetakpenumpang();
 }   
}
