import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Üçgenin tabanı: ");
        int taban = scanner.nextInt();
        System.out.print("Üçgenin Yüksekliği: ");
        int yukseklik = scanner.nextInt();
        System.out.println("Üçgenin alanı: "+taban*yukseklik/2);

        scanner.close();
    }
}