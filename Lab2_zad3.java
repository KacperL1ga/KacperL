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
        int temp;

        // Sortowanie liczb od najmniejszej do największej
        if (x > y) {
            temp = x;
            x = y;
            y = temp;
        }
        if (y > z) {
            temp = y;
            y = z;
            z = temp;
        }
        if (x > y) {
            temp = x;
            x = y;
            y = temp;
        }

        System.out.println("Liczby w porządku rosnącym: " + x + ", " + y + ", " + z);
    }
}
