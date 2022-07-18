package TipuriDeMemorieInJava;

public class Main {
    public static void main(String[] args) {

        //2.	Într-o clasa Main scrieți o metodă main în care sa instantiati două obiecte de tip Persoana.
        // Pentru fiecare obiect apelați metoda afiseazaInformatii.
        Persoana personOne = new Persoana("Andrei", 25);
        Persoana personTwo = new Persoana("Cristi", 35);
        personOne.afiseazaInformatii();
        personTwo.afiseazaInformatii();

        //3.	Definiți un alt obiect de tip Persoana care sa fie egal cu primul obiect Persoana
        // (ex: Persoana persoana3 = persoana1, unde persoana1 e definit mai sus).
        // Modificați varsta pentru persoana3 și apelați metoda afiseazaInformatii pentru primul și al treilea obiect.
        Persoana personThree = personOne;
        personThree.setVarsta(35);
        personOne.afiseazaInformatii();
        personThree.afiseazaInformatii();


        //5.	În main declarați un număr și:
        //a.	Afișați valoarea lui
        //b.	Apelați metoda atribuieInversul cu el
        //c.	Afișați valoarea lui - Care este rezultatul? De ce nu s-a schimbat valoarea?
        int nr = 5;
        System.out.println(nr);
        atribuieInversul(nr);
        System.out.println(nr);
        // variabila va avea aceeasi valoare ca cea stocata in stiva,
        // in cadrul metodei se inverseaza numarul dar nu i se atribuie variabilei aceasta noua valoare

        //7.	În main scrieți următoarele instrucțiuni:
        //a.	Afișați varsta pentru persoana1 (sau a unui obiect declarat la exercițiul 2)
        //b.	Apelați metoda cresteVarsta pentru persoana1
        //c.	Afișați varsta pentru persoana1 -> de ce s-a schimbat varsta în acest caz?
        System.out.println(personOne.varsta);
        cresteVarsta(personOne);
        System.out.println(personOne.varsta);
        // In acest caz se face apeleaza referinta (care este in stiva) catre valoarea variabilei varsta a obiectului
        // personOne stocata in heap, referinta de pe stiva nu se schimba, dar valoarea variabilei de pe heap, da si atunci
        //cand se reprinteaza varsta, se apeleaza aceeasi referinta de pe stiva, dar acum obiectul a fost modificat

        // 8.	La exercițiul 3 am definit un obiect (persoana3) care are același conținut ca și primul obiect (persoana1).
        // În main repetati exercitiul 7 dar pentru aceste obiecte. Observați că dacă apelați metoda pentru persoana1 și
        // apoi afișați persoana3 și persoana1, se vad modificările pentru ambele obiecte (pentru că ele se duc în același
        // loc în memoria Heap)
        System.out.println(personThree.varsta);

    }
    //4.	În clasa Main scrieți o metodă statică, care nu întoarce nimic, cu numele atribuieInversul care are ca
    // parametru un int și care îi atribuie acestui număr inversul valorii pe care o are (dacă parametrul are valoarea 8,
    // primește -8; dacă parametrul are valoarea -54, primește 54. Adică nr = -nr;)

    public static void atribuieInversul(int nr) {
        nr =-nr;
    }

    //6.	În clasa Main scrieți o metodă statică, cu tipul de return void și numele cresteVarsta care primește ca
    // parametru un obiect de tip Persoana și incrementeaza varsta acestui obiect.
    public static void cresteVarsta(Persoana person) {
        person.varsta++;
    }
}
