import jdk.jshell.spi.ExecutionControl;

import java.util.Random;
import java.util.Scanner;

public class CourseAppSix {
    public static void main(String[] args) {

        // VARIABLE
        int claim = 5;
        int randomNumber;
        int userNumberBetween;
        int userForecastNumber;

        // CLASSES
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        // User Number Between
        System.out.print("Sayı aralığı Belirtiniz..: ");
        userNumberBetween = sc.nextInt();

        /**
            # User Number Between -> (CONTROL)
            # content(UserForecastNumber | RANDOM NUMBER)
        */

        if(!(userNumberBetween <= 0)){
            // Random Number
            randomNumber = random.nextInt(userNumberBetween);
            if(randomNumber >= 0){
                System.out.println("Sayı Oluşturuldu. Tahmin Etmeye Çalışın.");
                System.out.println();
            }else{
                System.err.println("Sayı Oluşturulamadı.. Lütfen Uygulamayı Tekrar Çalıştırın");
            }

            // User Forecast Number
            System.out.print("Tahmini Sayı..: ");
            userForecastNumber = sc.nextInt();

            if(userForecastNumber < 0){
                System.err.println("Girdiğiniz Sayı 0'dan Küçük olamaz");
            }else{

                // USER FORECAST < RANDOM NUMBER -> (CONTROLS)
                if(userForecastNumber < randomNumber){
                    System.out.println("*** Yukarı ***");
                }else if(userForecastNumber > randomNumber){
                    System.out.println("*** Aşşağı ***");
                }else{
                    System.out.println();
                }

                // USER FORECAST == RANDOM NUMBER -> (SUCCESSFUL)
                if(userForecastNumber == randomNumber){
                    System.out.println("**************************");
                    System.out.println("*** Tebrikler Bildiniz ***");
                    System.out.println("**************************");
                }else{
                    claim = 4;

                    // USER FORECAST != RANDOM NUMBER -> (UNSUCCESSFUL)
                    while (userForecastNumber != randomNumber){
                        claim--;
                        if(claim == 0){
                            // CLAIM == 0 -> GAME STOP
                            System.err.println("OYUN BİTTİ. CAN KALMADI!!!");
                            System.out.println("Oluşturulan Sayı: " + randomNumber);
                            userForecastNumber = randomNumber;
                        }else{
                            // User Forecast Number
                            System.out.print("Tahmini Sayı..: ");
                            userForecastNumber = sc.nextInt();

                            // USER FORECAST < 0 -> (UNSUCCESSFUL)
                            if(userForecastNumber < 0){
                                System.err.println("Girdiğiniz Sayı 0'dan Küçük olamaz");
                            }else{
                                // CLAIM != 1 -> ForecastNumber and RandomNumber (CONTROLS)
                                if(claim != 1){
                                    if(userForecastNumber < randomNumber){
                                        System.out.println("*** Yukarı ***");
                                    }else if(userForecastNumber > randomNumber){
                                        System.out.println("*** Aşşağı ***");
                                    }else{
                                        System.out.println();
                                    }
                                }

                                // USER FORECAST == RANDOM NUMBER -> (SUCCESSFUL)
                                if(userForecastNumber == randomNumber){
                                    System.out.println("**************************");
                                    System.out.println("*** Tebrikler Bildiniz ***");
                                    System.out.println("********* Can: "+ claim + " *********");
                                }
                            }
                        }
                    }
                }
            }
        }else{
            System.err.println("0'dan Büyük bir sayı girmelisiniz.. PROGRAM SONLANDIRILDI!!");
        }


    }
}








