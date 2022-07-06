import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Boy metre cinsinden
        //Kilo kg cinsinden

        Scanner scan = new Scanner(System.in);
        double boy,kilo,bke;

        System.out.print("Boy : ");
        boy = scan.nextDouble();

        System.out.print("Kilo : ");
        kilo = scan.nextDouble();

        bke = kilo/(boy*boy);
        System.out.println("Beden Kitle Endeksiniz : " + bke);
        if(bke<=18.4)
            System.out.print("Beden kitle endeksiniz : Zayıf");
        else if(bke<=24.9)
            System.out.print("Beden kitle endeksiniz : Normal");
        else if(bke<=29.9)
            System.out.print("Beden kitle endeksiniz : Fazla Kilolu ");
        else
            System.out.print("Beden kitle endeksiniz : Obez");
    }
}