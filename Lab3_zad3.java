import java.util.Scanner;
public class Lab3_zad3 {
    public static int inputInt() {
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }
        public static void main(String[] args) {

            System.out.print("Podaj liczbę elementów w ciągu: ");
            int n = inputInt();

            int suma = 0;

            System.out.println("Podaj " + n + " liczb:");

            for (int i = 0; i < n; i++) {
                int x = inputInt();
                if (x % 2 == 0) {
                    suma += x;
                }
            }

            System.out.println("Suma liczb parzystych w ciągu wynosi: " + suma);

        }
}


