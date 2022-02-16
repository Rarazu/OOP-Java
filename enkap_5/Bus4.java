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
public class Bus4 {
  public int penumpang,maxpenumpang;
    
    // konstruktor
    public Bus4(int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
    }
    
    //method mutator 
    public void addpenumpang(int penumpang){
        int temp;
        temp=this.penumpang+penumpang;
        if (temp>maxpenumpang){
            System.out.println("Overload penumpang");
        }
        else {
            this.penumpang=temp;
        }
        
    }
    public void getpenumpang(int password){
        if (password==24){
            System.out.println("password benar");
        }
        else{
            System.out.println("password salah");
        }
    }
    public void cetakpenumpang(){
        System.out.println("Penumpang sekarang = "+penumpang);
        System.out.println("penumpang seharusnya adalah ="+maxpenumpang);
    }
   
}
