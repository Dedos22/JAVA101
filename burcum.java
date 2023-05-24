import java.util.Scanner;
public class burcum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int day, month;
        String burc = "";
        boolean isError = false;

        System.out.print("Doğduğunuz ay: ");
        month = inp.nextInt();
        System.out.print("Doğduğunuz gün: ");
        day = inp.nextInt();

        if (month == 1 && (day>=1 && day<=31)){
            if (day>=1 && day<=21){
                burc = ("Oğlak");
            }
            else {
               burc = ("Kova");
            }
        }

        else if (month == 2 && (day>=1 && day<=29)){
            if (day>=1 && day<=19){
               burc = ("Kova");
            }
            else {
                burc = ("Balık");
            }
        }

        else if (month == 3 && (day>=1 && day<=31)){
            if (day>=1 && day<=20){
                burc = ("Balık");
            }
            else {
                burc = ("Koç");
            }
        }

        else if (month == 4 && (day>=1 && day<=30)){
            if (day>=1 && day<=21){
                burc = ("Koç");
            }
            else {
               burc = ("Boğa");
            }
        }

        else if (month == 5 && (day>=1 && day<=31)){
            if (day>=1 && day<=21){
               burc = ("Boğa");
            }
            else{
                burc = ("İkizler");
            }
        }

        else if (month == 6 && (day>=1 && day<=30)){
            if (day>=1 && day<=22){
               burc= ("İkizler");
            }
            else {
               burc = ("Yengeç");
            }
        }

        else if (month == 7 && (day>=1 && day<=31)){
            if (day>=1 && day<=22){
                burc = ("Yengeç");
            }
            else{
               burc = ("Aslan");
            }
        }

        else if (month == 8 && (day>=1 && day<=31)){
            if (day>=1 && day<=22){
               burc = ("Aslan");
            }
            else{
              burc = ("Başak");
            }
        }

        else if (month == 9 && (day>=1 && day<=30)){
            if (day>=1 && day<=22){
               burc = ("Başak");
            }
            else {
                burc = ("Terazi");
            }
        }

        else if (month == 10 && (day>=1 && day<=31)){
            if (day>=1 && day<=22){
                burc = ("Terazi");
            }
            else{
              burc = ("Akrep");
            }
        }

        else if (month == 11 && (day>=1 && day<=30)){
            if (day>=1 && day<=21){
              burc = ("Akrep");
            }
            else {
                burc= ("Yay");
            }
        }

        else if (month == 12 && (day>=1 && day<=31)){
            if (day>=1 && day<=21){
               burc = ("Yay");
            }
            else{
               burc= ("Oğlak");
            }
        }


        else {
            isError = true;
            System.out.println("Doğru tarih giriniz");
        }

        if (isError == false)
            System.out.println("Burcunuz: " + burc);
    }
}
