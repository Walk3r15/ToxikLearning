
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    double cislo1;
    double cislo2;

     String operace;
     Scanner skener1 = new Scanner(System.in);
     Scanner skener2 = new Scanner(System.in);
     System.out.println("Zadejte první číslo:");
     cislo1 = skener1.nextInt();
     System.out.println("Číslo jedna je: " + cislo1);
     System.out.println("Zadejte druhé číslo:");
     cislo2 = skener1.nextInt();
     System.out.println("Číslo dvě je: " + cislo2);
     System.out.println("Vyberte operaci");
     operace = skener2.nextLine();
     switch(operace.toLowerCase()){
       case "scitej":
         System.out.println("Výsledek sčítání je:" + (cislo1 + cislo2));
         break;
       case "nasob":
         System.out.println("Výsledek násobení je:" + (cislo1 * cislo2));
         break;
       case "deleni":
         System.out.println("Výsledek dělení je: " + (cislo1 / cislo2));
         break;
       case "odecitani":
         System.out.println("Výsledek odečítání je: " + (cislo1 - cislo2));
         break;
       default:
         System.out.println("Neznám");
     }

     if(operace.toLowerCase() == "scitani"){
       System.out.println("Výsledek sčítání je:" + (cislo1 + cislo2));
     } else if (operace.toLowerCase() == "odecitani"){
       System.out.println("Výsledek odečítání je: " + (cislo1 - cislo2));
     } else if (operace.toLowerCase() == "nasobeni"){
       System.out.println("Výsledek násobení je:" + (cislo1 * cislo2));
     } else if (operace.toLowerCase() == "deleni") {
       System.out.println("Výsledek dělení je: " + (cislo1 / cislo2));
     } else {
       System.out.println("Neznám");
     }

     for (int i = 0; i <= 4; i++){
       System.out.println("Ahoj");
     }

    int[] cisla = new int[5];

      for (int y = 0; y <= 4; y++){
        int z = 10;
        cisla[y] = z;
        z = z + 5;
        System.out.println("Hodnota na pozici" + y + " je: " + cisla[y]);

      }

    System.out.println("Hodnota na první pozici je: " + cisla[1]);

  }

}
