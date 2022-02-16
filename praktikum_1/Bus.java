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
public class Bus {
    private double penumpang;
    private double maxPenumpang;
    private double counter;
    private double penumpangBaru;
    
        // konstruktor
    public Bus(double maxPenumpang){
        this.maxPenumpang=maxPenumpang;
        penumpang = 0;
    }
    
    //method mutator 
    public void addPenumpang(double penumpang){
        double temp;
        temp = this.penumpang+penumpang;
        if (temp>=maxPenumpang){
            System.out.println("Overload penumpang");
        }
        else {
            this.penumpang=temp;
        }
        
    }
    public void getPassword(int password){
        if (password==90){
            System.out.println("password benar");
        }
        else{
            System.out.println("pass salah");
        }
    }
    public double getAverage(){
        return penumpang/counter;
    }
    public void cetak(){
        System.out.println("Penumpang sekarang = "+penumpang);
        System.out.println("penumpang seharusnya adalah ="+maxPenumpang);
    }
            
}
