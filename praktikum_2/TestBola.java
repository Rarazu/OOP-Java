/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum_2;

/**
 *
 * @author MOKLET-1
 */
public class TestBola {
    public static void main(String[] args) {
        double jarijari = 14;
        Bola objekbola = new Bola(7);
        objekbola.showDiameter();
        objekbola.showLuasPermukaan();
        objekbola.showVolume();
        System.out.println("\n");
        objekbola.setJarijari(jarijari);
        objekbola.showDiameter();
        objekbola.showLuasPermukaan();
        objekbola.showVolume();
    }
}
