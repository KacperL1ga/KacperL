import java.util.Scanner;

public class Zadanie2 {
    public static void zadanie2(int a , int b){
        System.out.println("Suma "+ a+" + "+ b+ " = "+ (a+b));
        System.out.println("Roznica "+ a+" - "+ b+ " = "+ (a-b));
        System.out.println("Iloczyn "+ a+" * "+ b+ " = "+ (a*b));
    }
    public static int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }
    public static void main(String[] args) {
        System.out.println("Podaj a: ");
        int a = inputInt();
        System.out.println("Podaj b: ");
        int b = inputInt();
        zadanie2(a,b);

    }
}
