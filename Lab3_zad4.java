import java.util.Random;
import java.util.Scanner;

public class Lab3_zad4 {
    public static int randomInt(int x, int y){
        Random random = new Random();
        int rand = random.nextInt(y-x+1)+x;
        return rand;
    }
    public static int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }

    public static void main(String[] args) {
        System.out.print("Podaj liczbę elementów w ciągu: ");
        int n = inputInt();

        int suma = 0;

        System.out.println("Wylosowane liczby: ");

        for (int i = 0; i < n; i++) {
            int x = randomInt(-10,45);
            System.out.print(x+" ");
            if (x % 2 == 0) {
                suma += x;
            }
        }

        System.out.println("Suma liczb parzystych w ciągu wynosi: " + suma);

    }
}

