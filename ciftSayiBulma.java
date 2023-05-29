//Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı

import java.util.Scanner;

public class ciftSayiBulma{
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        System.out.print("bir sayi giriniz:");
        int a =input.nextInt();
    
        for(int i=0;i<=a;i++){
            if(i%2==0){
                 System.out.println(i);
            }
        }

     
    }
}
