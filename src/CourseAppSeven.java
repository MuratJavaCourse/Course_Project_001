import java.text.DecimalFormat;
import java.util.Scanner;

public class CourseAppSeven {
    public static void main(String[] args) {

        // VARIABLE
        String decimalUserKG;

        // CLASSES
        Scanner scanner = new Scanner(System.in);

        // USER HEIGHT & KG
        System.out.print("Boyunuzu Giriniz..: ");
        Double userHeight = scanner.nextDouble();

        System.out.print("Kilonuzu Giriniz..: ");
        Double userKG = scanner.nextDouble();

        if(userHeight > 0 && userKG > 0){
            userHeight+=userHeight;
            userKG/=userHeight;

            decimalUserKG = new DecimalFormat("##.##").format(userKG);

            System.out.println();
            System.out.println("**** VÜCUT KİTLE ENDEKSİ ****");
            if(userKG >= 0 && userKG <= 18.4){
                System.out.println("Vücut Kitle Endeksi: " + '(' + decimalUserKG + ')');
                System.out.println("(ZAYIF) Kişinin boyuna oranla ağırlığı yetersiz.");
            }else if(userKG >= 18.5 && userKG <= 24.9){
                System.out.println("Vücut Kitle Endeksi: " + '(' + decimalUserKG + ')');
                System.out.println("(NORMAL) Bu değer aralığı kişinin ideal kiloda olduğunu gösterir.");
            }else if(userKG >= 25 && userKG <= 29.9){
                System.out.println("Vücut Kitle Endeksi: " + '(' + decimalUserKG + ')');
                System.out.println("(FAZLA KİLOLU) Kişinin boyuna oranla kilosunun fazla olduğunu gösterir.");
            }else if(userKG >= 30 && userKG <= 34.9){
                System.out.println("Vücut Kitle Endeksi: " + '(' + decimalUserKG + ')');
                System.out.println("(ŞİŞMAN) Birinci derece obez kategorisinde değerlendirilir.");
            }else if(userKG >= 35 && userKG <= 44.9){
                System.out.println("Vücut Kitle Endeksi: " + '(' + decimalUserKG + ')');
                System.out.println("(ŞİŞMAN 2) İkinci derece obez kategorisinde değerlendirilir.");
            }else if(userKG >= 45){
                System.out.println("Vücut Kitle Endeksi: " + '(' + decimalUserKG + ')');
                System.out.println("(AŞIRI ŞİŞMAN) Üçüncü derece obez kategorisinde değerlendirilir.");
            }else{
                System.out.println("Böyle Bir Vücut Kitle Endeksi Tanımlanamadı");
            }
            System.out.println("******************************");
        }else{
            System.err.println("Boy ve Kilo Oranlarınızı girmeniz Gerek");
        }

    }
}









