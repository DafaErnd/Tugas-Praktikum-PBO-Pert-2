/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_praktikum_2;

/**
 *
 * @author dafae
 */
public class Matematika implements InterfaceMatematika {
    
    @Override
    public int pertambahan(int a, int b){
        int hasil = a + b;
        System.out.println("Hasil : " + hasil);
        return hasil;
    }
    
    @Override
    public int pengurangan(int a, int b){
        int hasil = a - b;
        System.out.println("Hasil : " + hasil);
        return hasil;
    }
    
    @Override
    public int perkalian(int a, int b){
        int hasil = a * b;
        System.out.println("Hasil : " + hasil);
        return hasil;
    }
    
    @Override
    public int pembagian(int a, int b){
        int hasil = a / b;
        System.out.println("Hasil : " + hasil);
        return hasil;
    }
}
