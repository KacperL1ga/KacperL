import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        System.out.println("Podaj x: ");
        int x = inputInt();
        zadanie4(x);

    }
    public static int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }
    public static void zadanie4(int x){
        if (x%3 == 0 && x%5 == 0){
            System.out.printf("True");
        }
        else {
            System.out.printf("Zla liczba");
        };
    }
}
