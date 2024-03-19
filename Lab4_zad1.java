import java.util.Random;
import java.util.Scanner;

public class Lab4_zad1 {
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
        System.out.println("Podaj liczbę elementów w tablicy");
        int a =inputInt();
        System.out.println("Podaj przedział liczb od: ");
        int x =inputInt();
        System.out.println(" do: ");
        int y =inputInt();

            int suma = 0;
            int srednia = 0;
            int[] tablica = new int[a];

            for(int i = 0; i < 10; i++){
                tablica[i] = randomInt(x,y);
            }

            for(int k : tablica){
                suma += k;
            }

            srednia = suma/tablica.length;
            System.out.println("Średnia wartosci tablicy wynosi: "+ srednia);
            System.out.println("Suma liczb w tablicy wynosi: "+ suma);

    }
}
