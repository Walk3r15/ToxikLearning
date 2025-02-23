
import java.util.Scanner;

public class UkazkaScanner {

    public static void main(String[] args) {
        //deklarace proměnných
        int strana1;
        int strana2;
        String zadani;
        int vysledek;
        /* 
        více řádků
        v podmínce 
         */
        Scanner brambora = new Scanner(System.in);

        System.out.println("Zadej délku první strany: ");
        strana1 = brambora.nextInt();
        System.out.println("Zadej délku druhé strany: ");
        strana2 = brambora.nextInt();

        if (strana1 == strana2) {
            System.out.println("Tohle je čtverec debile ");
        } else {
            System.out.println("Chceš vypočítat obvod nebo obsah? ");
            zadani = brambora.next();
            if (zadani.equals("obvod")) {
                vysledek = obvodObdelniku(strana1, strana2);
                System.out.println("Výsledek je: " + vysledek);
            } else if (zadani.equals("obsah")) {
                vysledek = obsahObdelniku(strana1, strana2);
                System.out.println("Výsledek je: " + vysledek);
            } else {
                System.out.println("Si debil ");
            }
        }
        brambora.close();
    }

    //metoda na vypocet obsahu obdelniku
    public static int obsahObdelniku(int strana1, int strana2) {
        return strana1 * strana2;
    }

    //metoda na vypocet obvodu obdelniku
    public static int obvodObdelniku(int strana1, int strana2) {
        return (strana1 + strana2) * 2;
    }
}
