import java.util.Scanner;

public class Lab2_zad3 {
    public static void main(String[] args) {
        System.out.println("Podaj a: ");
        int x = inputInt();
        System.out.println("Podaj b: ");
        int y =inputInt();
        System.out.println("Podaj c: ");
        int z =inputInt();
        zadanie2(x,y,z);
    }
    public static int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }
    public static void zadanie2(int x, int y, int z) {
        int zmienna;

        // Sortowanie liczb od najmniejszej do najwiekszej
        if (x > y) {
            zmienna = x;
            x = y;
            y = zmienna;
        }
        if (y > z) {
            zmienna = y;
            y = z;
            z = zmienna;
        }
        if (x > y) {
            zmienna = x;
            x = y;
            y = zmienna;
        }

        System.out.println("Liczby w porzadku rosnacym: " + x + ", " + y + ", " + z);
    }
}
