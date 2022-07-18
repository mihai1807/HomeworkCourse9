package TipuriDeMemorieInJava;

public class Persoana {
    String nume;
    int varsta;
//1.Sa se scrie un constructor care primește ca parametru un String, care reprezinta numele persoanei și un int care
// reprezinta varsta. Scrieți și o metodă cu numele afiseazaInformatii care afișează numele și vârsta.
    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }
    public void afiseazaInformatii() {
        System.out.println("Numele: " + this.nume);
        System.out.println("Varsta: " + this.varsta);
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}
