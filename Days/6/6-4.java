import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //220-284
        int sayi2 = 220;
        int sayi1 = 284;
        int sayi1Toplam =0;
        int sayi2Toplam = 0;

        for (int i=1; i<sayi1; i++){
            if(sayi1%i==0)
                sayi1Toplam = sayi1Toplam + i;
        }
        for (int i=1; i<sayi2; i++){
            if(sayi2%i==0)
                sayi2Toplam = sayi2Toplam + i;
        }

        if(sayi1==sayi2Toplam && sayi2 ==sayi1Toplam)
            System.out.println("Sayılarınız arkadaş sayıdır!");
        else
            System.out.println("Sayılar arkadaş sayı değildir!");

    }
}
