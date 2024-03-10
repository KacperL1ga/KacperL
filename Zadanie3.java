import java.util.Scanner;

public class Zadanie3 {

    public static void main(String[] args) {
        System.out.println("Podaj a: ");
        int a = inputInt();
        zadanie3(a);

    }
    public static int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }
    public static void zadanie3(int a){
        if (a%2 == 0){
            System.out.printf("True");
        }
        else {
            System.out.println("Podales zla liczbe :( ");
        }
    }
}
