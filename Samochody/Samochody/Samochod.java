public class Samochod {
    String Marka, Model, Nadwozie, Kolor;
    int Rok_produkcji;
    int Przebieg;

    public Samochod(String marka, String model, String nadwozie, String kolor, int rok_produkcji, int przebieg) {
        Marka = marka;
        Model = model;
        Nadwozie = nadwozie;
        Kolor = kolor;
        Rok_produkcji = rok_produkcji;
        Przebieg = Math.abs(przebieg);
    }
    //TODO konstruktor przeciazeniowy aby wartosci pol byly parametrami metody
    String dane(){
        return "Marka Samochodu: "+Marka+", Model: "+Model+", Nadwozie: "+Nadwozie+", Kolor: "+Kolor+
                ", Rok produkcji: "+Rok_produkcji+", Przbieg: "+Przebieg;
    }
}
