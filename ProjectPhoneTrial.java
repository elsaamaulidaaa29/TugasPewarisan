/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package praktikum1.projectphonetrial;

import java.util.Scanner;

/**
 *
 * @author ASUS
 * ELSAMAULIDA_21103002
 */

public class ProjectPhoneTrial {
    


    public static void main(String[] args) {
        Phone redmiNote8 = new Xiaomi();
        
        PhoneUser dian = new PhoneUser(redmiNote8);
        
        dian.turnOnThePhone();
        
        Scanner input = new Scanner(System.in);
        String aksi;
        
        while(true){
            System.out.println("===APLIKASI INTERFACE===");
            System.out.println("1. Nyalakan Hp");
            System.out.println("2. Matikan Hp");
            System.out.println("3. Perbesar Volume");
            System.out.println("4. Kecilkan Volume");
            System.out.println("0. Keluar");
            System.out.println("---------------------------");
            aksi = input.nextLine();
            
            if(aksi.equalsIgnoreCase("1")){
                dian.turnOnThePhone();
            }else if(aksi.equalsIgnoreCase("2")){
                dian.turnOffThePhone();
            }else if(aksi.equalsIgnoreCase("3")){
                dian.makePhoneLouder();
            }else if(aksi.equalsIgnoreCase("4")){
                dian.makePhoneSilent();
            }else if(aksi.equalsIgnoreCase("0")){
                System.exit(0);
            }else{
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }
        
    }
}
