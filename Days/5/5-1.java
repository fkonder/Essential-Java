public class Main {

    public static void main(String[] args) {

        String message = "Hi, I'm Omer Faruk!";
        System.out.println("Message is: "+message);

        System.out.println("Number of elements of the message: "+message.length());
        System.out.println("5. element: " + message.charAt(4));
        System.out.println(message.concat(" Nice to meet you!"));

        System.out.println(message.startsWith("H"));
        System.out.println(message.endsWith("."));

        char[] characters = new char[7];
        message.getChars(0, 6, characters, 0);
        System.out.println(characters);

        System.out.println(message.indexOf('a'));
        System.out.println(message.indexOf("Omer"));
        System.out.println(message.lastIndexOf("!"));


    }
}
