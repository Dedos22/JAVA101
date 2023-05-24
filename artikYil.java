//
import java.util.Scanner;
public class artikYil{
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.print( " yıl giriniz:" );
    int year=input.nextInt();
    if(year%4==0 || year%400==0){
        System.out.print( "artık yıldır");
    }else{
        System.out.print( "artık yıl değildir." );
    }

     
   
  } 
    }

