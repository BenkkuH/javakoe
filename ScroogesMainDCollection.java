
import java.util.Scanner;
import java.util.ArrayList;

public class ScroogesMainDCollection {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> diamonds = new ArrayList<>();

        while (true) {
            System.out.print("Lisää kokoelmaan: ");
            String gem = reader.nextLine();
            if (gem.isEmpty()) {
                break;
            }
            diamonds.add(gem);
        }
        System.out.println("Kokoelman sisältö:");
        for (String diamond : diamonds) {
            System.out.println(diamond);
        }

    }

}
