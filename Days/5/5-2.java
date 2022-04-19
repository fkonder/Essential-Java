import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String message = "Hi, I'm Omer Faruk!";
        System.out.println("Message is: "+message);
        System.out.println(message.replace(' ', '-'));

        System.out.println(message.substring(4,12));

        for (String word: message.split(" ")){
            System.out.println(word);
        }
        System.out.println(message.toLowerCase(Locale.ROOT));
        System.out.println(message.toUpperCase(Locale.ROOT));

    }
}
