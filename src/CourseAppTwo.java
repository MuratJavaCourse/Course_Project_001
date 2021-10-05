import java.util.Scanner;

public class CourseAppTwo {
    public static void main(String[] args) {

        // VARIABLES
        Scanner input = new Scanner(System.in);

        // GET VALUE
        System.out.print("Lütfen Bir değer giriniz..: ");
        int value = input.nextInt();

        if(value < 0){
            System.out.println("Lütfen Pozitif bir sayı giriniz.");
        }else{
            // APP TWO
            for(int i=1; i<=value; i++){
                // Drawing
                for(int j=1; j<=value; j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }


    }
}
