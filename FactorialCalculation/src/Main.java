import java.util.Scanner;

public class Main {

    public static int FactCal(int sayi){
        int sonuc = 1;
        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;
        }
        return sonuc;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Faktöriyelini hesaplamak istediğiniz sayıyı girin: ");
        int number = scanner.nextInt();
        while (true){
            if (number < 0) {
                System.out.println("Negatif sayı girdiniz...");
            }
            else {
                System.out.println(number+"! sayısının değeri: "+FactCal(number));
                break;
            }
        }


    }
}