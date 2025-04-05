import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rnd = new Random();
        int rndNum = rnd.nextInt(100);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Tahmininizi girin: ");
        int guess = scanner.nextInt();

        while (true){
            if (guess==rndNum)
            {
                System.out.println("Tebrikler! Doğru Tahmin.");
                break;
            }
            else{
                if (guess<rndNum){
                    System.out.print("Daha büyük bir tahmin yapın: ");
                    guess = scanner.nextInt();
                }
                else{
                    System.out.print("Daha küçük bir tahmin yapın: ");
                    guess = scanner.nextInt();
                }
            }
        }

    }
}