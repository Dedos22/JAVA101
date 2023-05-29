//tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan program
import java.util.Scanner;

public class myDongu{
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
          int a=0,toplam=0;
      
        while(a%2==0){
              System.out.print("bir sayi giriniz:");
               a =input.nextInt();
               if(a%2==0 && a>=0 && a%4==0){
                   toplam=toplam+a;
                       System.out.println(a+"çift ve dördün katıdır.Toplam degere eklendi.");
               }
               else{
                     System.out.println("Tek ve negatif sayilar girmek işlemi sonlandırır.");
               }
               
        }
        System.out.println("toplam:"+toplam);
     
    }
}
