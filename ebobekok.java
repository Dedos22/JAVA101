import java.util.Scanner;
public class ebobekok {
    public static void main(String args[]) {
     
      Scanner input=new Scanner(System.in);
      System.out.println("Sayı Giriniz:");
      int x=input.nextInt();
      System.out.println("Sayı Giriniz:");
      int y=input.nextInt();
      if(x>y){
          int a=y;
          while(true){
              if(x%a==0 && y%a==0 ){
                   System.out.println("EBOB:"+a);
                    System.out.println("EKOK:"+(x*y)/a);
                   break;
              }
              else{
                  a--;
              }
              
          }
      }else{
           int a=x;
          while(true){
              if(y%a==0 && x%a==0 ){
                   System.out.println("EBOB:"+a);
                    System.out.println("EKOK:"+(x*y)/a);
                   break;
              }
              else{
                  a--;
              }
              
          }
      }
      
     //EKOK = (n1*n2) / EBOB
     
    }
}
