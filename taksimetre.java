//Taksimetre Programı
//Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
//Taksimetre KM başına 2.20 TL tutmaktadır. 
//Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır. 20/2.20=? km
//Taksimetre açılış ücreti 10 TL'dir.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      System.out.print("KM:");
      Scanner km= new Scanner(System.in);
      double mesafe=km.nextDouble();
      int open=10;
      int minucret=20;
      double sabit=2.20;
      double ucret=mesafe*sabit;
      if(ucret < minucret){
         ucret=minucret;
        System.out.println("odeme:"+ucret);
      }else{
         ucret=ucret+open;
          System.out.println("odeme:"+ucret);
      }
      
    }
}
