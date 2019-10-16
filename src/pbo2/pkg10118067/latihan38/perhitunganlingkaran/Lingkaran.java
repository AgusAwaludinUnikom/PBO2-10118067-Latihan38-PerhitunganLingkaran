/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan38.perhitunganlingkaran;

/**
 *
 * @author Kiyo
 */
public class Lingkaran {
    private int diameter;

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    
    private int hitungJariJari() {
        return diameter / 2;
    }
    
    private double hitungLuas() {
        return Math.PI * Math.pow(hitungJariJari(), 2);
    }
    
    private double hitungKeliling() {
        return 2 * Math.PI * hitungJariJari();
    }
    
    private String formatNilai(double nilai) {
        return String.format("%.2f", nilai).replace('.', ',');
    } 
    
    public void hitungLingkaran() {
        System.out.println();
        System.out.println("====Hasil Perhitungan Lingkaran====");
        System.out.println("Jari-jari Lingkaran = " +
                hitungJariJari() + " cm");
        System.out.println("Luas Lingkaran = " +
                formatNilai(hitungLuas()) + " cm");
        System.out.println("Keliling Lingkaran = " +
                formatNilai(hitungKeliling()) + " cm");
        
    }
    
}
