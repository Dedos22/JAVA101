import java.util.Scanner;
 
public class Main{
     public static void main(String[] args) {
       Scanner inp=new Scanner(System.in);
       System.out.print("fiyat giriniz");
       double fiyat=inp.nextDouble();
       int  kdvoran=18;
       double kdvFiyat, kdvtutar;
       if(0<fiyat<=1000){
          kdvtutar=fiyat*(kdvoran/100);
          kdvFiyat=kdvtutar+fiyat;
       }else if(fiyat>1000){
           kdvoran=8;
           kdvtutar=fiyat*(kdvoran/100);
           kdvFiyat=kdvtutar+fiyat;
        }else{
           System.out.print("error");
        }
       System.out.println("KDV'siz Fiyat:"+ fiyat); 
       System.out.println("KDV'li Fiyat:"+ kdvFiyat);
       System.out.println("KDV tutarı:"+ kdvtutar);
     }
}