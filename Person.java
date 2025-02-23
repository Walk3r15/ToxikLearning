public class Person{

    int vek;
    String jmeno;
    String pohlavi;
    String prijmeni;

    //konstruktor
    public Person(int vek, String jmeno, String pohlavi, String prijmeni){
        this.vek = vek;
        this.jmeno = jmeno;
        this.pohlavi = pohlavi;
        this.prijmeni = prijmeni;
        
    }

    // === gettery 
    public int getVek(){
        return vek;
    }

    public String getJmeno(){
        return jmeno;
    }

    public String getPohlavi(){
        return pohlavi;
    }
    // === settery ===
    public void setVek(int vek){
        this.vek = vek;
    }

    public void prejmenujOsobu(String noveJmeno){
        this.jmeno = noveJmeno;
    }

    // === metody ===
    // je osoba plnoleta?
    public String jePlnoleta(){
    return vek >= 18 ? "ANO" : "NE";
    }

    //vypis vsechno
    public void vypisVse(){
        System.out.println("Info o osobě: " + jmeno + " věk: " + vek + " pohlaví: " + pohlavi);
    }

    public static void main(String[] args) {
        Person karel = new Person (60, "Karel", "Muž", "Novák");
        Person karolina = new Person(12, "Karolínka", "Žena", "Nováková");
        Person hans = new Person(32, "Honza", "Muž", "Ledecký");
        Person johanka = new Person(19, "Johanka", "Žena", "Čunková");
        System.out.println("Osoba 1 je: " + karel.getJmeno());
        System.out.println("Osoba 2 je: " + karolina.getJmeno());
        System.out.println("Karoline je: " + karolina.getVek() + "a je: " + karolina.getPohlavi());
        System.out.println("Je karolina plnoletá?: " + karolina.jePlnoleta());
        System.out.println("Je Karel plnoletý?: " + karel.jePlnoleta());
        karel.prejmenujOsobu("Pepíno");
        karolina.prejmenujOsobu("Pepa");
        System.out.println("Osoba karel má teď jméno: " + karel.getJmeno());
        System.out.println("Osoba karolína má teď jméno: " + karolina.getJmeno());
        karolina.vypisVse();
        hans.vypisVse();
    }
}


