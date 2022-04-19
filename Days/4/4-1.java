public class Main {

    public static void main(String[] args) {
        String ogrenci1 = "Omer Faruk";
        String ogrenci2 = "Engin";

        String[] students = new String[4];
        students[0] = "Ahmet";
        students[1] = "Mehmet";
        students[2] = "Dilara";
        students[3] = "Mustafa";

        for(int i = 0; i<4; i++)
            System.out.println(students[i]);


        for(String ogrenci:students){
            System.out.println(ogrenci);
        }


    }
}
