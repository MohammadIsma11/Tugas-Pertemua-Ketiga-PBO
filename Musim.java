/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan3;

/**
 *
 * @author ISMAIL
 */
public abstract class Musim {
    //methode abstrak class
    abstract public void Kemarau();
    //method yang akan di override
    
    public void punyaMusim(){
        System.out.println("Saya dari kelas Musim");
    }
    //method yang akan di overload
    public void Suhu(int temperatur){
        System.out.println("Suhu saat ini mencapai " + temperatur + " derajat");
    }
}