public class Auto{

    String znacka;
    double objemMotoru;
    String barva;
    int objemNadrze;

    //konstruktor

    public Auto(String znackaAuta, double objemMotoruValcu, String barvaKaroserie, int objemNadrzeLitry){
        znacka = znackaAuta;
        objemMotoru = objemMotoruValcu;
        barva = barvaKaroserie;
        objemNadrze = objemNadrzeLitry;
    }

    // getter
    public int getObjemNadrze(){
        return objemNadrze;
    }

    public String getZnacka(){
        return znacka;
    }

    public double getObjemMotoru(){
        return objemMotoru;
    }

    public String getBarvaAuta(){
        return barva;
    }

    //setter
    public void nastavObjemNadrze(int novyObjem){
        this.objemNadrze = novyObjem;
    }

    public void nastavBarvu(String novaBarva){
        this.barva = novaBarva;
    }


    // metoda
    public void donatankuj(int objemNadrze){
        if (objemNadrze == 100){
            System.out.println("Ale auto má nádrž plnou");
        } else {
            int kolikByloPaliva = 100 - objemNadrze;
            this.objemNadrze = 100;
            System.out.println("DONTAKOVANO: " + kolikByloPaliva);
        }
    }

    public static void main(String[] args) {
        Auto atrojka = new Auto("Audi", 1.9, "Modrá", 72);
        System.out.println("Radimovo auto je značky " + atrojka.znacka + " a má objem nádrže: " + atrojka.objemNadrze + " litrů.");
        System.out.println("Barva auta je:" + atrojka.barva);
        // atrojka.nastavObjemNadrze(100);
        atrojka.donatankuj(atrojka.objemNadrze);
        atrojka.nastavBarvu("Zelená");
        System.out.println("Radimovo auto je značky " + atrojka.znacka + " a má objem nádrže: " + atrojka.objemNadrze + " litrů.");
        System.out.println("Barva auta je:" + atrojka.barva);
    }
}