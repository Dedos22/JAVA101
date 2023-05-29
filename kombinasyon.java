//kombinasyon hesaplayan program
import java.util.Scanner;

public class kombinasyon{
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
              System.out.print("N:");
              int n=input.nextInt();
               System.out.print("r:");
              int r=input.nextInt();
              
              
               //C(n,r) = n! / (r! * (n-r)!)
              double kombinasyon=faktoriyel(n)/(faktoriyel(r)*faktoriyel(n-r));
              System.out.println("kombinasyon:"+ kombinasyon);
 
    }
   static int faktoriyel(int a){
          int islem=1;
              while(a>0){
                     islem=islem*a;
                    a--;
              }
          //  System.out.println(islem);
            return islem;
    }
}
