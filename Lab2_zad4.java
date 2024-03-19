import java.util.Scanner;

public class Lab2_zad4 {
    public static int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }
    public static void main(String[] args) {
        System.out.println("Czy pada deszcz?");
        System.out.println("Wybierz: 1-Tak  0-Nie");
        int deszcz = inputInt();
        System.out.println("Czy jest autobus na przystanku?");
        System.out.println("Wybierz: 1-Tak  0-Nie");
        int autobus = inputInt();
        zadanie4(deszcz,autobus);
    }

    public static void zadanie4 (int deszcz, int autobus){
        if (deszcz == 1 && autobus == 1){
            System.out.println("Weź parasol, Dostaniesz się na uczelnie");
        } else if (deszcz != 0 && autobus != 1) {
            System.out.println("Nie dostaniesz sie na uczelnie");
        }
        else if (deszcz != 1 && autobus == 1){
            System.out.println("Dostaniesz sie na uczelnie");
            System.out.println("Miłego dnia i pięknej pogody");
        }
    }
}
