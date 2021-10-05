import java.util.Scanner;

public class CourseAppFive {
    public static void main(String[] args) {

        // APP FIVE

        // VARIABLES
        Scanner input = new Scanner(System.in);

        // USER VALUES
        System.out.print("İlk Sayıyı Giriniz..: ");
        int s1 = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz..: ");
        int s2 = input.nextInt();

        // CONTROL
        if(s1 > s2){
            System.out.println("Birinci Sayı olan: " + s1 + " Büyüktür " + s2 + "'den");
        }else if(s1 < s2){
            System.out.println("İkinci Sayı olan: " + s2 + " Büyüktür " + s1 + "'den");
        }else{
            System.out.println("İki sayı birbirine eşittir.");
        }

        // OPERATIONS
        System.out.println();

        System.out.println("(1) Toplama");
        System.out.println("(2) Çıkartma");
        System.out.println("(3) Çarpma");
        System.out.println("(4) Bölme");
        System.out.println("(0) Çıkış Yap");

        System.out.print("İşlem Numarası: ");
        int selected = input.nextInt();

        if(selected > 4){
            System.err.println("Tanımlanamayan İşlem: Program Sonlandırıldı!!!");
        }else{
            switch (selected){
                case 1:
                    System.out.println("Sayıların Toplamı: " + (s1 + s2));
                break;

                case 2:
                    System.out.println("Sayıların Farkı: " + (s1 - s2));
                break;

                case 3:
                    System.out.println("Sayıların Çarpımı: " + (s1 * s2));
                break;

                case 4:
                    System.out.println("Sayıların Bölümü: " + (s1 / s2));
                break;

                default:
                    System.out.println("Program Sonlandırıldı!!!");
            }
        }


    }
}






