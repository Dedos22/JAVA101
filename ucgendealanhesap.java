//Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.


import java.util.Scanner;
public class Main{
   public static void main(Sring[] args){
   int input=new Scanner(System.in);
   System.out.print("Birinci kenar uzunluk giriniz:");
   int a=input.nextInt();
   System.out.print("İkinci kenar uzunluk giriniz:");
   int b=input.nextInt();
   System.out.print("Üçüncü kenar uzunluk giriniz:");
   int c=input.nextInt();
   int u=(a+b+c)/2;
   int cevre=2*u;
   int alan=Math.sqrt(u*(u-a)*(u-b)* (u-c));
    System.out.println("Alan:+alan");
   
   }

}
