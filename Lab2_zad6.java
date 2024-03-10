import java.util.Scanner;

public class Lab2_zad6 {
    public static int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }
    public static void main(String[] args){
        System.out.println("Wybierz rodzaj operacji:");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnozenie");
        System.out.println("4. Dzielenie");
        System.out.println("5. Reszta z dzielenia");
        int opcja = inputInt();
        System.out.println("Podaj a: ");
        int a = inputInt();
        System.out.println("Podaj b: ");
        int b =inputInt();

        switch (opcja) {
            case 1:
                System.out.println("Wynik dodawania: " + (a + b));
                break;
            case 2:
                System.out.println("Wynik odejmowania: " + (a - b));
                break;
            case 3:
                System.out.println("Wynik mnozenia: " + (a * b));
                break;
            case 4:
                System.out.println("Wynik dzielenia: " + (a / b));
                break;
            case 5:
                System.out.println("Reszta z dzielenia: " + (a % b));
                break;
            default:
                System.out.println("Niepoprawny wybor operacji.");
        }
    }
}