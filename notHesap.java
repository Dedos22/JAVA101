import java.util.Scanner;
public class notHesap{
  public static void main(String[] args){
    int mat,fizik,turkce,kimya,muzik;
    Scanner input=new Scanner(System.in);
    System.out.print("Matematik Notunuz:");
    mat=input.nextInt();
     if(mat<0 || mat>100){
            System.out.println("Gecersiz mat notu  Ortalamaya katilmayacak");
            mat= 0;
        }
    System.out.print("Fizik Notunuz:");
    fizik=input.nextInt();
     if (fizik<0 || fizik>100){
            System.out.println("Gecersiz fizik notu Ortalamaya katilmayacak");
            fizik=0;
        }
    System.out.print("Turkce Notunuz:");
    turkce=input.nextInt();
     if (turkce<0 || turkce>100){
            System.out.println("Gecersiz turkce notu  Ortalamaya katilmayacak");
            turkce=0;
        }
    System.out.print("Kimya Notunuz:");
    kimya=input.nextInt();
     if (kimya<0 || kimya>100){
            System.out.println("Gecersiz kimya notu Ortalamaya katilmayacak");
            kimya=0;
        }
    System.out.print("Muzik Notunuz:");
    muzik=input.nextInt();
    if(muzik)
      if (muzik<0 || muzik>100){
            System.out.println("Gecersiz kimya notu Ortalamaya katilmayacak");
            muzik=0;
        }
    double ortalama=((mat+turkce+muzik+kimya+fizik)/5);
    if(ortalama<=55){
      System.out.println("Sınıfta kaldınız.");
    //  System.out.println("Ortalamanız:"+ortalama);
    }else{
      System.out.println("Tebrikler sinifi geçtiniz");
     //  System.out.println("Ortalamanız:"+ortalama);
    }
    System.out.println("Ortalamanız:"+ortalama);
  }
}
