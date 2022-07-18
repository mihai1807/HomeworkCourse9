package P1;

public class Admitere {
    private static double ultimaMedie;
    private static int locuriTotale;
    private static int locuriOcupate;

    public static double getUltimaMedie() {
        return ultimaMedie;
    }

    public static void setUltimaMedie(double ultimaMedie) {
        Admitere.ultimaMedie = ultimaMedie;
    }

    public static int getLocuriTotale() {
        return locuriTotale;
    }

    public static void setLocuriTotale(int locuriTotale) {
        Admitere.locuriTotale = locuriTotale;
    }

    public static int getLocuriOcupate() {
        return locuriOcupate;
    }

    public static void setLocuriOcupate(int locuriOcupate) {
        Admitere.locuriOcupate = locuriOcupate;
    }
    public static boolean acceptaStudent(Student student) {
        if (locuriOcupate == locuriTotale) {
            System.out.println("Toate locurile sunt ocupate");
            return false;
        } else if (student.getMedieAdmitere() > ultimaMedie) {
            System.out.println("Este admis");
            return true;
        } else{
            System.out.println("Nu a fost admis");
            return false;

    }
    }
}
