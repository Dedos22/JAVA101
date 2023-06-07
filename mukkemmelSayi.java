import java.util.Scanner;
public class mukkemmelSayi {
    public static void main(String args[]) {
     
      Scanner input=new Scanner(System.in);
       System.out.print("Sayi:");
      int sayi=input.nextInt();
      int toplam= 0;
        for(int i=1;i<sayi;i++)
        {
          if(sayi%i==0){
              toplam=toplam+i;
          }
        }
        if(sayi==toplam){
            System.out.println("mükkemmel sayıdır.");
        }else{
               System.out.println("mükkemmel sayı değildir.");
        }
    }
}
