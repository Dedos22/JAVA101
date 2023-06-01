import  java.util.Scanner;
public class usluSayi{
    public static void main(String args[]) {
        Scanner inp=new Scanner(System.in);
        System.out.println("x^y için x değeri giriniz:"); 
        int x=inp.nextInt();
        System.out.println("y değeri giriniz:");
        int y=inp.nextInt();
        double z=1 ;
        if(y==0){
              z=1;
        }else{
             for(int i=1;i<=y;i++){
                 z=z*x;
              
              }
        }
      System.out.println("x^y = " + z);
    }
}
