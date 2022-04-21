import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        char harf = 'A';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Harf kalın seslidir.");
                break;
            case 'İ':
            case 'E':
            case 'Ü':
            case 'Ö':
                System.out.println("Harf ince seslidir.");
                break;
            default:
                System.out.println("Yanlış girdi verdiniz.");
                break;
        }

    }
}
