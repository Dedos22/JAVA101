//Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

import java.util.Scanner;
public class ucgendealanhesap{
   public static void main(String[] args){
   Scanner input=new Scanner(System.in);
   System.out.print("Birinci kenar uzunluk giriniz:");
   int a=input.nextInt();
   System.out.print("İkinci kenar uzunluk giriniz:");
   int b=input.nextInt();
   System.out.print("Üçüncü kenar uzunluk giriniz:");
   int c=input.nextInt();
    int u=(a+b+c)/2;
   int cevre=2*u;
   double alan=Math.sqrt(u*(u-a)*(u-b)* (u-c));
    System.out.println("Alan:"+alan);
   
   }
}
