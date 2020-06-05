
package SınıfL;

import java.util.Scanner;

enum Sonuç  { Kaldi,Gecti };//Kaldı GEçtiyi enum olarak sabitledik
enum Sınıf{Halil,İbrahim,Hasan;//Sınıf listesini olusturduk

    public int not;//Girilecek olan notu int değeri olarak tanımladık
    
    }


public class SınıfL {

    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        System.out.print(Sınıf.Halil+" Notunu giriniz: ");//Halilin notunu klavyeden alınan girdi olarak kaydettik
        Sınıf.Halil.not=girdi.nextInt();
        System.out.print(Sınıf.İbrahim+" Notunu giriniz: ");
        Sınıf.İbrahim.not=girdi.nextInt();
        System.out.print(Sınıf.Hasan+" Notunu giriniz: ");
        Sınıf.Hasan.not=girdi.nextInt();
        
       for(Sınıf a:Sınıf.values()){//sınıfı döngüye soktuk
           if(a.not>=80&&a.not<=100){//if ile 80e eşit notları ve yükseklere geçti olarak ekrana yansıttık
               System.out.println(a+" : "+Sonuç.Gecti);    
           }
           else if(a.not<=79&&a.not>=0){//else if ile 79e eşit notları ve düşük kaldı olarak ekrana yansıttık
           System.out.println(a+" : "+Sonuç.Kaldi); }
           else//girilen yanlıs notları belirtik
           { System.out.println("Lütfen doğru puan giriniz.");}
       }}}
