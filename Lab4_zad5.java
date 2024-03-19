import java.util.Arrays;
import java.util.Scanner;

public class Lab4_zad5 {

    public static int inputInt() {
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }

    public static void main(String[] args) {

        System.out.println("Podaj 8 liczb ");

        int[] cyfry = new int[8];
        for (int i = 0; i < 8; i++) {
            cyfry[i] = inputInt();
        }
        Arrays.sort(cyfry);
        System.out.println("Liczby posortowane w sposób rosnący: ");
        for (int i = 0; i < cyfry.length; i++) {
            System.out.print(cyfry[i] + " ");
        }
    }
}
