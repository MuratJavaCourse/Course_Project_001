import java.util.Scanner;

public class CourseAppThree {
    public static void main(String[] args) {

        // VARIABLES
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Bir değer giriniz..: ");
        int value = input.nextInt();

        // UPSIDE
        for(int i=1; i<=value; i++){
            System.out.print("* ");
        }

        System.out.println();

        // MIDDLE SIDE
        for(int j=1; j<=value; j++){
            System.out.print("* ");

            for(int i=1; i<=(value*2)-4; i++){
                System.out.print(" ");
            }

            System.out.println("*");
        }

        // UNDERSIDE
        for(int i=1; i<=value; i++){
            System.out.print("* ");
        }


    }
}
