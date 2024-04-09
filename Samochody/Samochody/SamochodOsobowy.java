public class SamochodOsobowy extends Samochod {

    double Waga, Pojemnosc_silnika;
    int Liczba_osob;
    public SamochodOsobowy(String marka, String model, String nadwozie, String kolor, int rok_produkcji, int przebieg) {
        super(marka, model, nadwozie, kolor, rok_produkcji, przebieg);
        this.Waga = Waga;
        this.Pojemnosc_silnika = Pojemnosc_silnika;
        this.Liczba_osob = Liczba_osob;
    }
    String dane(){
        return "Marka Samochodu: "+Marka+", Model: "+Model+", Nadwozie: "+Nadwozie+", Kolor: "+Kolor+
                ", Rok produkcji: "+Rok_produkcji+", Przbieg: "+Przebieg+", Waga: "+Waga+
                ", Pojemnosc_silnika: "+Pojemnosc_silnika+", Liczba osob: "+Liczba_osob;
    }
}
