import java.util.Scanner;

public class recursiveUsalma {
  


    static void usalma(int taban,int us) {
        Scanner scan = new Scanner(System.in);
       
        int result = 1;

        for (int i = 1; i <= us; i++) {
            result *= taban;
        }

        System.out.println("Sonuç : " + result);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int taban,us;
        System.out.println("taban:");
        taban=scan.nextInt();
        System.out.println("us:");
        us=scan.nextInt();
        usalma(taban,us);
           
           

    }
}
