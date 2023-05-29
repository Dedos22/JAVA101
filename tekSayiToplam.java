//java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
import java.util.Scanner;

public class tekSayiToplam{
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
          int a=0,tekToplam=0;
      
        while(a>=0){
              System.out.print("bir sayi giriniz:");
               a =input.nextInt();
               if(a%2!=0 && a>=0){
                   tekToplam=tekToplam+a;
                       System.out.println(a+"tek sayidir.Toplam degere eklendi.");
               }else{
                   a++;
               }
               
        }
        System.out.println("tektoplam:"+tekToplam);
     
    }
}
