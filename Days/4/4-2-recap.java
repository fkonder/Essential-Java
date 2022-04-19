public class Main {

    public static void main(String[] args) {

        double[] myList = {1.3, 3.1, 5.2, 6.9, 7.1, 9.9};
        double sum = 0;
        double maxNumber = myList[2];

        for (double numbers : myList) {
            if (maxNumber < numbers)
                maxNumber = numbers;
            sum += numbers;
            System.out.println(numbers);
        }
        System.out.println("Numbers total is: " + sum);
        System.out.println("Max number is: " + maxNumber);

    }
}
