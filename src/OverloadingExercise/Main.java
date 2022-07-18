package OverloadingExercise;

public class Main {
    public static void main(String[] args) {

        //10.	 Apelați toate metodele cu diverse valori într-o metoda main și rulați programul
        System.out.println(MathUtils.inmulteste(5,2));
        System.out.println(MathUtils.inmulteste(2,5,7));
        System.out.println(MathUtils.inmulteste(3,2.5));
        System.out.println(MathUtils.inmulteste(3.3,8));
    }
}
