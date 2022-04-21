import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] sayilar = new int[]{1,2,9,5,6,4,9,31,49};
        int arananSayi = 5;
        boolean sayiVar = false;
        for(int i=0; i<sayilar.length; i++){
            if(sayilar[i] == arananSayi)
                sayiVar = true;
        }
        if(sayiVar)
            System.out.println("Sayı dizide vardır!");
        else
            System.out.println("Sayı dizide yoktur!");

    }
}
