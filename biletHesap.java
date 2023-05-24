//Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. 
//Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

//Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
//Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
//Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
//Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
//Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
//Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

import  java.util.Scanner;
public class biletHesap{
    public static void main(String[] args){
      Scanner input=new Scanner(System.in);
      int fiyat,age,mesafe,tip,toplam;
    
      System.out.print("Yasinizz:");
      age=input.nextInt();
      System.out.print("mesafe km:");
      mesafe=input.nextInt();
        System.out.print("yolculuk tipi:1-tek yon 2-gidis-donus");
      tip=input.nextInt();
      toplam=(10*mesafe)/100;
      int a=toplam=(10*mesafe)/100;
      if(mesafe>0 && age>0 && ( tip==1 || tip==2)){
                 System.out.println(" veri girişi başarılı");
              if(age<=12){
                  toplam=toplam-((toplam*50)/100);
                   
              }else if(age>12 && age<24){
                  toplam=toplam-((toplam*10)/100);
                   
              }else if(age>=65){
                  toplam=toplam-((toplam*30)/100);
                  
              }else{
                   System.out.println("yaş indirimi yok");
                  
              }
               if(tip==2){
                 toplam=2*(toplam-(toplam*20/100));
              }
             
         System.out.println("toplam tutar:"+toplam);
        
      }else{
        System.out.println("Hatalı veri girişi");
      }
      
     
    }
    
    
}
