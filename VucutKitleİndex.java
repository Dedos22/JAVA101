// Vücut Kitle İndeksi Hesaplama
//Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. 
//Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

//Formül
//Kilo (kg) / Boy(m) * Boy(m)

import java.util.Scanner;    //Kullanıcıdan değer almayı sağlar
public class Main{
  public static void main(String[] args){
    //Değişkenler
   
    double kilo,boy,indeks;
    //Scanner sınıfı tanımlandı
    Scanner inp=new  Scanner(System.in);
    //kullanıcıdan değer al
    System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz:");
    boy=inp.nextDouble();
    System.out.print("Lütfen kilonuzu giriniz(kg):");
    kilo=inp.nextDouble();
    indeks=kilo/boy^2;
    System.out.println("Vücut Kitle İndeksiniz :"+ indeks);
  

  }


}
