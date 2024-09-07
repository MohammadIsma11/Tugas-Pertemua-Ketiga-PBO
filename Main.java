/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan3;

/**
 *
 * @author ISMAIL
 */
public class Main {
    public static void main(String[] args) {
       Kondisi panas = new Kondisi();
       //abstrak kelas
       panas.Kemarau();
       //overload dengan parameter
       panas.Suhu(30);
       panas.Suhu("Jepang", 23);
       //override
       panas.cekMusim();
    }
}
