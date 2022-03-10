/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idmanprogramı;
import java.util.Scanner;
/**
 *
 * @author kubra
 */
public class Idman {
    private int burpee_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;

    public Idman(int burpee_sayisi, int pushup_sayisi, int situp_sayisi, int squat_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
        this.pushup_sayisi = pushup_sayisi;
        this.situp_sayisi = situp_sayisi;
        this.squat_sayisi = squat_sayisi;
    }

    public int getBurpee_sayisi() {
        return burpee_sayisi;
    }

    public void setBurpee_sayisi(int burpee_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
    }

    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    public int getSitup_sayisi() {
        return situp_sayisi;
    }

    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }

    public int getSquat_sayisi() {
        return squat_sayisi;
    }

    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }
    public void Hareket_Yap(String hareket_turu,int sayi){
        if(hareket_turu.equals("Burpee")){
            burpeeYap(sayi);
        }
        else if(hareket_turu.equals("Pushup")){
            PushUpyap(sayi);
        }
        else if(hareket_turu.equals("Situp")){
            SitUpYap(sayi);
        }
        else if(hareket_turu.equals("Squat")){
            SquatYap(sayi);
        }
        else {
            System.out.println("Geçerli bir antreman ismi girin.");
        }
    }
    public void burpeeYap(int sayi){
        if(burpee_sayisi==0){
            System.out.println(" YAPILACAK  BURPEE KALMADI.");
        }
        if(burpee_sayisi-sayi<0){
              System.out.println("TEBRİKLER BURPEE SAYISINDA GEÇTİNİZ.");
        }
        else if(burpee_sayisi-sayi>0){
            int kalan=burpee_sayisi-sayi;
            System.out.println("Kalan burpee sayısı : "+kalan);
        }
      
    }
     public void PushUpyap(int sayi){
        if(pushup_sayisi==0){
            System.out.println(" YAPILACAK  PUSHUP KALMADI.");
        }
        if(pushup_sayisi-sayi<0){
              System.out.println("TEBRİKLER PUSHUP SAYISINDA GEÇTİNİZ.");
        }
        else if(pushup_sayisi-sayi>0){
            int kalan=pushup_sayisi-sayi;
            System.out.println("Kalan PUSHUP sayısı : "+kalan);
        }
      
    }
       public void SitUpYap(int sayi){
        if(situp_sayisi==0){
            System.out.println(" YAPILACAK  SİTUP KALMADI.");
        }
        if(situp_sayisi-sayi<0){
              System.out.println("TEBRİKLER SİTUP SAYISINDA GEÇTİNİZ.");
        }
        else if(situp_sayisi-sayi>0){
            int kalan=situp_sayisi-sayi;
            System.out.println("Kalan SİTUP sayısı : "+kalan);
        }
    }
        
       
     public void SquatYap(int sayi){
        if(squat_sayisi==0){
            System.out.println(" YAPILACAK  SQUAT KALMADI.");
        }
        if(squat_sayisi-sayi<0){
              System.out.println("TEBRİKLER SQUAT SAYISINDA GEÇTİNİZ.");
        }
        else if(squat_sayisi-sayi>0){
            int kalan=squat_sayisi-sayi;
            System.out.println("Kalan squat sayısı : "+kalan);
        }
            
     }

     public  boolean Idman_Bitti_Mi(){
         return (burpee_sayisi==0) && (squat_sayisi==0) && (situp_sayisi==0)&& (pushup_sayisi==0);
     }

}
