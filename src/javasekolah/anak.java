/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasekolah;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class anak extends Parent {
    Scanner info = new Scanner(System.in);
    
    void lengkap(String name, int age, int klass) {
        System.out.print("Masukkan nama  : ");
        this.nama = name = info.nextLine();
        System.out.print("Masukkan umur  : ");
        this.umur = age = info.nextInt();
        System.out.print("Masukkan kelas : ");
        this.kelas = klass = info.nextInt();
    }
    
    @Override
    void panggil() {
        System.out.println("");
        System.out.println("Biodata "+nama);
        System.out.println("Nama  : "+nama);
        System.out.println("Umur  : "+umur);
        System.out.println("Kelas : "+kelas);
    }
    public int perhitungan(int x, int y) {
        System.out.print("Masukkan luas  : ");
        x = info.nextInt();
        System.out.print("Masukkan lebar : ");
        y = info.nextInt();
        return x * y;
    }
    public double perhitungan(double x) {
        System.out.print("Masukkan jari-jari : ");
        x = info.nextDouble();
        return Math.PI * (x*x);
    }
    void pemilihan() {
        System.out.println("1. Persegi");
        System.out.println("2. lingkaran");
        System.out.print("Masukkan pilihan : ");
        int pilih = wow.nextInt();
        
        if(pilih == 1) {
            int num1 = perhitungan(0,0);
            System.out.println("Luas : "+num1);
        } else if(pilih == 2) {
            double num2 = perhitungan(0);
            System.out.println("Luas : "+num2);
        }
    } 
    
}
