/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idmanprogramı;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author kubra
 */
public class İDMANPROGRAMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İDMAN OLUŞTURMA PROGRAMINA HOŞGELDİNİZ.");
        System.out.println("İdman oluşturmak için değerleri girin: ");
        
        System.out.println("Push up sayısı gir: ");
        int pushup=scanner.nextInt();
        System.out.println("Situp sayısı gir: ");
        int situp=scanner.nextInt();
        System.out.println("Squat sayısı gir: ");
        int squat=scanner.nextInt();
        System.out.println("Burpee sayısı gir: ");
        int burpee=scanner.nextInt();
        
        Idman idman=new Idman(burpee,pushup,situp,squat);
        
        while(idman.Idman_Bitti_Mi()==false){
            scanner.nextLine();
            System.out.println(" Hareket Türü(Burpee,Pushup,Situp,Squat)Seçin : ");
            String hareket_tur=scanner.nextLine();
            System.out.println("Bu harekette kaç tane yapacaksınız? ");
            int sayi=scanner.nextInt();
            idman.Hareket_Yap(hareket_tur, sayi);
            
        }
        
    }
    
}
