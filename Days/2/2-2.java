public class Main {

    public static void main(String[] args) {
	    int number1= 20;
        int number2 = 24;
        int number3 = 10;

        String greatest = "";

        if(number2>number1 && number2>number3){
            greatest = "number2";
        }
        if(number3>number2 && number3>number1)
            greatest = "number3";
        if(number1>number2 && number1>number3)
            greatest = "number1";

        System.out.println(greatest);
    }
}
