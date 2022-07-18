package OverloadingExercise;

public class MathUtils {

    //9.	Scrieți o clasa MathUtils care expune mai multe metode statice:
    //a.	inmulteste(int a, int b) - întoarce a * b
    //b.	inmulteste(int a, int b, int c) - întoarce a * b * c
    //c.	inmulteste(int a, double b) - întoarce a * b
    //d.	inmulteste(double a, int b) - întoarce a * b

    public static int inmulteste (int a, int b){
        return  a*b;
    }

    public static int inmulteste (int a, int b, int c){
        return  a*b*c;
    }

    public static double inmulteste (int a, double b){
        return  a*b;
    }

    public static double inmulteste (double a, int b){
        return  a*b;
    }

}
