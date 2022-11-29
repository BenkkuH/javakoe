
import java.util.Scanner;

public class ScoogesDiamondMain {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Anna palkkion suuruus karaatteina: ");
        int rewardWeight = Integer.valueOf(reader.nextLine());
        int totalDiamondWeight = 0;

        while (true) {
            while (totalDiamondWeight < rewardWeight) {
                System.out.print("Anna löydetyn timantin paino: ");
                int diamondWeight = Integer.valueOf(reader.nextLine());
                totalDiamondWeight += diamondWeight;
            }
            break;
        }
        System.out.println("Palkkio maksettu.");
    }

}
