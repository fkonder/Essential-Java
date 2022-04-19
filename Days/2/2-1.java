public class Main {

    public static void main(String[] args) {
        int number1 = 10;

        if(number1<20){
            System.out.println("Number is less than 20");
            number1+=10;
        }
        else if(number1==20){
            System.out.println("Number is equal to 20");
            number1+=2;
        }
        else
            System.out.println("Number is greater than 20");
}