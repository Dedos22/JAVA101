import java.util.Scanner;
public class kullaniciLogin{
  public static void main(String[] args){
     String password="abc123",name="java";
     String ad,sifre;
     Scanner input=new Scanner(System.in);
     System.out.print("Kullanıcı adınızı  giriniz:");
     ad=input.nextLine();
     System.out.print("Şifrenizi  giriniz:");
     sifre=input.nextLine();
    if(name==ad && sifre==password){
      System.out.println("login success ");
    }else{
      System.out.println("Yanlış şifre ,Şifrenizi sıfırlamak ister misiniz?1-Evet 2-Hayır");
      int select;
      select=input.nextInt();
      if(select==1){
         System.out.println("Yeni sifre giriniz:");
         String yenisifre=input.nextLine();
         if (yenisifre!=password){
               password=yenisifre;
              System.out.println("şifreniz sıfırlandı");
           }else {
                System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz");
             }
      }else{
           System.out.println("şifreniz sıfırlanmadı.İyi gunler");
      }      
    }    
  }
}
