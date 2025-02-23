
import java.util.Scanner;

public class Scanner {

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
                vysledek = (strana1 + strana2) * 2;
                System.out.println("Výsledek je: " + vysledek);
            } else if (zadani.equals("obsah")) {
                vysledek = (strana1 * strana2);
                System.out.println("Výsledek je: " + vysledek);
            } else {
                System.out.println("Si debil ");
            }
        }
        brambora.close();
    }
}
