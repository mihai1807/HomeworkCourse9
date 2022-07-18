package P1;



public class Student {
    public static int counter = 0;{counter++;}
    private final String nume;
    private String facultate;
    private double medieAdmitere;

    public Student(String nume, String facultate, double medieAdmitere) {
        this.nume = nume;
        this.facultate = facultate;
        this.medieAdmitere = medieAdmitere;
    }

    public String getNume() {
        return nume;
    }

    public String getFacultate() {
        return facultate;
    }

    public double getMedieAdmitere() {
        return medieAdmitere;
    }

    public void setFacultate(String facultate) {
        if (facultate.length() < 3) {
            System.out.println("Numele facultatii este prea scurt, va fi setat automat XXX");
            this.facultate = "XXX";
        }
        else this.facultate = facultate;
    }


    public void setMedieAdmitere(double medieAdmitere) {
        if (medieAdmitere<1 || medieAdmitere>10) {
            System.out.println("Media trebuie sa fie intre 1 si 10, se va seta valoarea default 1");
            this.medieAdmitere = 1;
        }
        else this.medieAdmitere = medieAdmitere;
    }
}
