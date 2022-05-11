//built-in paketler kendinde var
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Adınızı giriniz: ");
        String isim = scanner.nextLine();

        System.out.println("Merhaba " + isim);
    }
}