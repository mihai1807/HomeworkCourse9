package P2;
import P1.*;
public class Main {
    public static void main(String[] args) {
        Admitere.setLocuriOcupate(Student.counter);
        Admitere.setLocuriTotale(3);
        Admitere.setUltimaMedie(5.0);
        Student primul = new Student("Andrei","ASE", 7.55 );
        Student alDoilea = new Student("Cristian", "UMC",5.8);
        Student alTreilea = new Student("Alex", "Ovidius", 9.34);
        primul.setMedieAdmitere(11);
        alDoilea.setMedieAdmitere(5.5);
        alTreilea.setMedieAdmitere(0.5);
        primul.setFacultate("facultate");
        Admitere.acceptaStudent(primul);
        Admitere.acceptaStudent(alDoilea);
        Admitere.acceptaStudent(alTreilea);

    }
}
