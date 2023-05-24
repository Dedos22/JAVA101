import java.util.Scanner;
public class HesapMakinesi{
   public static void main(String[] args){
       int a,b,select;
       Scanner input=new Scanner(System.in);
       System.out.print("birinci sayı:");
       a=input.nextInt();
       System.out.print("ikinci sayı:");
       b=input.nextInt();
      System.out.print("1+Toplama \n 2-Çikarma\n 3-çarpma \n 4-Bolme--> işlem seçiniz:");
      select=input.nextInt();
     
    switch(select){
        case 1 : 
           System.out.println("toplam:"+ (a+b)); 
           break;
         case 2 :
            System.out.println("çikarma::"+ (a-b)); 
            break;
         case 3 :
             System.out.println("çarpma:"+ (a*b)); 
             break;
         case 4 :
              System.out.println("bolme:"+ (a/b)); 
              if (b == 0) {
                    System.out.println("Bir sayı 0'a bölünemez!");
                    break;
                }
              break;
      default:
        System.out.println("ERROR"); 
    }
   }
}
