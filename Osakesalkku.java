
public class Osakesalkku {

    private double arvo;

    public Osakesalkku(double maara) {
        this.arvo = maara;
    }

    public double annaArvo() {
        return arvo;
    }

    public void lisaaRahaa(double maara) {
        if (maara < 0) {

        } else {
            this.arvo += maara;
            System.out.println("Salkussasi on nyt " + String.format("%.2f", annaArvo()) + " euroa.");
        }
    }

    public boolean poistaRahaa(double maara) {
        if (arvo >= maara && maara >= 0) {
            this.arvo -= maara;
            return true;
        } else {
            return false;
        }
    }

    public void muutaArvoa(double muutos) {
        this.arvo = this.arvo + (arvo * muutos / 100);
    }

    public double nostaOsinkoa() {
        return 0.05 * arvo;
    }

    public String toString() {
        return "Salkussasi on " + String.format("%.2f", annaArvo()) + " euroa.";

    }

}
