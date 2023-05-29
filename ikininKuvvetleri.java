//girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran program
import java.util.Scanner;

public class ikininKuvvetleri{
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
              System.out.print("bir sayi giriniz:");
              int a=input.nextInt();
             
              for(int b=0;b<=a;b++){
                  double islem=Math.pow(2,b);
                  System.out.println(islem);
              }
            
     
    }
}
