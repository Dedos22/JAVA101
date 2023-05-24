import java.util.Scanner;
 
public class kdvtutarhesap{
     public static void main(String[] args) {
       Scanner inp=new Scanner(System.in);
       System.out.print("fiyat giriniz");
      double fiyat=inp.nextInt();
      double  kdvoran=18;
       double kFiyat, ktutar;
       if(0<fiyat && fiyat<=1000){
          ktutar=fiyat*kdvoran/100;
          kFiyat=ktutar+fiyat;
           System.out.println("KDV'siz Fiyat:"+ fiyat); 
       System.out.println("KDV'li Fiyat:"+ kFiyat);
       System.out.println("KDV tutarı:"+ ktutar);
       }else if(fiyat>1000){
           kdvoran=8;
           ktutar=fiyat*kdvoran/100;
           kFiyat=ktutar+fiyat;
            System.out.println("KDV'siz Fiyat:"+ fiyat); 
       System.out.println("KDV'li Fiyat:"+ kFiyat);
       System.out.println("KDV tutarı:"+ ktutar);
        }else{
           System.out.print("error");
        }
      
     }
}
