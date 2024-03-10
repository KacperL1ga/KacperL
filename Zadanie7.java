import java.util.Random;
import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        System.out.println("Podaj a: ");
        int a = inputInt();
        System.out.println("Podaj b: ");
        int b =inputInt();
        zadanie7(a,b);

    }
    public static int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }
    public static int losuj(int a, int b){
        Random random = new Random();
        int liczba = random.nextInt(b - a + 1)+a;
        return liczba;
    }
    public static void zadanie7(int a, int b){
        int j=losuj(a,b);
        int k=losuj(a,b);
        int l=losuj(a,b);
        if (j*j + k*k == l*l || j*j == k*k + l*l || j*j + l*l == k*k){
            System.out.println("True, liczby to: "+j+" "+k+" "+l);
        }
        else System.out.printf("Zla kombinacja liczb, liczby to: "+j+" "+k+" "+l);
    }
}
