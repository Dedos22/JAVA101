import java.util.Scanner;

public class tamBolen{
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        System.out.print("bir sayi giriniz:");
        int a =input.nextInt();
        int sayac=0; int ort,toplam=0;
        for(int i=1;i<=a;i++){
            if(i%3==0 && i%4==0){
                toplam=toplam+i;
                sayac++;
                  System.out.println(i);
            }
        }
        ort=toplam/sayac;
        System.out.println("ortalama:"+ort);
     
    }
}
