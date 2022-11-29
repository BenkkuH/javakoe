
import java.util.Scanner;

public class Porssimeklari {

    private Scanner reader;

    public Porssimeklari(Scanner reader) {
        this.reader = reader;
    }

    public void startTrading() {
        System.out.print("Tervetuloa pörssiin! Paljonko haluat aluksi sijoittaa osakesalkkuusi? ");
        double maara = Double.valueOf(reader.nextLine());
        Osakesalkku dolaninSalkku = new Osakesalkku(maara);
        System.out.println("Osakesalkku luotu! " + dolaninSalkku);
        while (true) {
            System.out.println("");
            System.out.println("Mitä haluaisit tehdä?");
            System.out.println("1) lisää salkkuun rahaa");
            System.out.println("2) poista salkusta rahaa");
            System.out.println("3) päivitä salkun arvo");
            System.out.println("4) nosta osinkoa");
            System.out.println("5) lopeta");
            String command = reader.nextLine();

            if (command.equals("5")) {
                System.out.println("Kiitos ja näkemiin!");
                break;
            }

            if (command.equals("1")) {
                System.out.print("Kuinka paljon rahaa haluat sijoittaa lisää? ");
                double lisaa = Double.valueOf(reader.nextLine());
                dolaninSalkku.lisaaRahaa(lisaa);
            }

            if (command.equals("2")) {
                System.out.print("Kuinka paljon rahaa haluat nostaa salkustasi?  ");
                double nosta = Double.valueOf(reader.nextLine());
                if (dolaninSalkku.poistaRahaa(nosta)) {
                    System.out.println("Salkustasi on nostettu " + String.format("%.2f", nosta) + " euroa. " + dolaninSalkku);
                } else {
                    System.out.println("Nosto epäonnistui. " + dolaninSalkku);
                }

            }

            if (command.equals("3")) {
                System.out.print("Anna muutosprosentti: ");
                double muutos = Double.valueOf(reader.nextLine());
                dolaninSalkku.muutaArvoa(muutos);
                System.out.println("Salkussasi on nyt " + String.format("%.2f", dolaninSalkku.annaArvo()) + " euroa.");
            }

            if (command.equals("4")) {
                System.out.println("Nostit osinkoa " + dolaninSalkku.nostaOsinkoa() + " euroa.");

            }
        }

    }

}
