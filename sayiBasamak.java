import java.util.Scanner;

public class sayiBasamak {
    public static void main(String[] args) {
        int i,h,t,o,sum;
        Scanner input = new Scanner(System.in);
        System.out.print("sayi: ");
        i = input.nextInt();
        h = i / 100;
        t = (i/ 10) % 10;
        o = i % 10;
        sum = h + t + o;

        System.out.println("yüzler : " + h);
        System.out.println("onlar: " + t);
        System.out.println("binler: " + o);
        System.out.println("toplam: " + sum);

    }
}
