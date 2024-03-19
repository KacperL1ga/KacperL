import java.util.Scanner;

public class Lab3_zad2 {
    public static int inputInt() {
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }

    public static void main(String[] args) {
        zadanie2();
    }
        public static void zadanie2 () {
            int x = 1;
            int sumaD = 0;
            int sumaU = 0;
            int liczba_D = 0;
            int liczba_U = 0;
            while (x <= 10) {
                System.out.println("Podaj liczbe: ");
                int y = inputInt();
                if (y > 0) {
                    sumaD = sumaD + y;
                    liczba_D = liczba_D + 1;
                } else if (y < 0) {
                    sumaU = sumaU + y;
                    liczba_U = liczba_U + 1;
                }
                x=x+1;
            }
            System.out.println("Liczba liczb dodatnich równa się: " + liczba_D);
            System.out.println("Suma liczb dodatnich równa się: " + sumaD);
            System.out.println("Liczba liczb ujemnych równa się: " + liczba_U);
            System.out.println("Suma liczb dodatnich równa się: " + sumaU);
        }
}



