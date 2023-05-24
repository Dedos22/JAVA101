//Koşullar :

//Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
//Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
//Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
//Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

import java.util.Scanner;
publiz class havaDurumu{
  public static void main(String[] args){
    int derece;
    Scanner inp=new Scanner(System.in);
    System.out.print( "Hava sicakliğini giriniz:");
    derece=inp.nextInt();
    if(derece<5){
      System.out.print( "Kayak yapabilirsiniz");
    }else if(5<=derece<15){
      System.out.print( "Sinemaya gitmek güzel olur.");
    }else if(15<=derece<25){
      System.out.print( "Piknik için mükkemmel bir hava");
    }else{
      System.out.print( "Yüzmeye gitmelisin.");
    }
    
  }
}
