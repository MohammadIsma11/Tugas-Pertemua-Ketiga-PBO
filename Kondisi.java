/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan3;

/**
 *
 * @author ISMAIL
 */
public class Kondisi extends Musim {
    //method abstrak class turunan
    @Override
    public void Kemarau() {
        System.out.println("Sekarang lagi kemarau");
    }
    //method override turunan
    @Override
    public void punyaMusim(){
        System.out.println("saya dari kelas kondisi");
    }
    //method overload turunan
    public void Suhu(String tempat, int temperatur){
        System.out.println("Di " + tempat + " Suhu saat kemarau mencapai " + temperatur + " derajat");
    }
    //cek override
    public void cekMusim(){
        this.punyaMusim();
        super.punyaMusim();
    }
}
