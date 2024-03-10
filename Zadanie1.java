public class Zadanie1 {
    public String Imie() {
        return "Kacper";
    }

    public int Wiek() {
        return 20;
    };
    public static void main(String[] args) {
        Zadanie1 Dane = new Zadanie1();
        System.out.println("Imie: "+Dane.Imie()+ " wiek: "+Dane.Wiek());

    }
}