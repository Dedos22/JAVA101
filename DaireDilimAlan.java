//Yarıçapı r , merkez açısının boyutu 𝛼 olan daire diliminin alanı bulan programını ayırın.

//𝜋 yaslamak = 3.14 alınız.

//Formül : (𝜋 * (r*r) * 𝛼) / 360
import java.util.Scanner;
public class Main(){
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    
    System.out.print( "yarıcap giriniz:" );
    double r=input.nextDouble();

    double pi=3.14;
    System.out.print( "acı giriniz:");
    int acı=input.nextDouble();
    int sonuc=(pi*(r^2)*acı)/360;
  System.out.prinln("Alan:"+sonuc);
} 
    }
