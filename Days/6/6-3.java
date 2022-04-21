import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Mükemmel sayı = kendinden başka kendini bölen sayıların toplamı kendine eşit olan sayılar mükemmel sayıdır, verilen sayının mükemmel olup olmadığını yazdıran program.

        int number = 6;
        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }
        if (total == number)
            System.out.println("Girilen sayi mukemmeldir!");
        else
            System.out.println("Girilen sayi mukemmel degildir!");


    }
}
