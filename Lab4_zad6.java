import java.util.Scanner;

public class Lab4_zad6 {

    public static int inputInt() {
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }
    public static int silnia(int n) {
        if (n == 0)
            return 1;
        else
            return n * silnia(n - 1);
    }
    public static void main(String[] args) {

        System.out.println("Podaj 5 liczb ");

        int[] cyfry = new int[5];
        for (int i = 0; i < cyfry.length; i++) {
            cyfry[i] = inputInt();
        }
        for(int i = 0; i< cyfry.length; i++){
            int silnia =silnia(cyfry[i]);
            System.out.println("Silnia liczby "+cyfry[i]+" wynosi: "+silnia);
        }
    }
}
