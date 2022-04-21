import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //prime number detector

        System.out.printf("Please type a number: ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        boolean isPrime = true;

        for(int i=2; i<number1; i++){
            if(number1%i ==0)
                isPrime = false;


        }
        if(isPrime)
            System.out.println("Number is prime");

        else
            System.out.println("Number is not prime!");


    }
}
