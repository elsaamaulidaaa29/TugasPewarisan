/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum1.projectphonetrial;

/**
 *
 * @author ASUS
 * ELSAMAULIDA_21103002
 */
public class Oppo implements Phone{
    
    private int volume;
    private boolean isPowerOn;
    
    public Oppo (){
        this.volume = 50;
    }
    
    @Override
    public void powerOn(){
        isPowerOn = true;
        System.out.println("Handphone menyala...");
        System.out.println("Selamat datang di Oppo");
        System.out.println("Android version 29");
    }
    
    @Override
    public void powerOff(){
        isPowerOn = false;
        System.out.println("Handphone dimatikan");
    }
    
    @Override
    public void volumeUp(){
        if(isPowerOn){
            if(this.volume == MAX_VOLUME){
                System.out.println("Volume FULL!");
                System.out.println("sudah "+this.getVolume() + "%");
        }else{
            this.volume += 10;
            System.out.println("Volume sekarang : "+ this.getVolume());
        }
    }else{
            System.out.println("Nyalakan dulu Hpnya");
        }
    }
    
    @Override
    public void volumeDown(){
        if(isPowerOn){
            if(this.volume == MIN_VOLUME){
                System.out.println("Volume = 0%");
            }else{
                this.volume -= 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        }else{
            System.out.println("Nyalankan dulu Hpnya");
            }
    }
    
    public int getVolume(){
        return this.volume;
    }   
}