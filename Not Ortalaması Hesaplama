import java.util.Scanner;    //Kullanıcıdan değer almayı sağlar
public class Main{
  public static void main(String[] args){
    //Değişkenler
    int mat,fizik,kimya,tarih,muzik;
    //Scanner sınıfı tanımlandı
    Scanner inp=new  Scanner(System.in);
    //kullanıcıdan değer al
    System.out.print("matematik notu giriniz:");
    mat=inp.nextInt();
    
    System.out.print("Fizik notunu giriniz:");
    fizik=inp.nextInt();
    
    System.out.print("Kimya notunuzu giriniz:");
    kimya=inp.nextInt();
    
    System.out.print("müzik notunuzu giriniz:");
    muzik=inp.nextInt();
    System.out.print("tarih notunuzu giriniz:");
    tarih=inp.nextInt();
    //Ortalama hesaplama
    int toplam=(mat+fizik+tarih+kimya+muzik);
    double ortalama=toplam/5;
    System.out.println("Ortalamanız="+ortalama);
    
    //Sınıfta kalma geçme durumu
    boolean durum=(ortalama >= 60 ? "Geçtiniz":"kaldınız");
    
    
  }


}
