import java.util.Scanner;

public class Lab2_zad2 {
    public static void main(String[] args) {
        System.out.println("Podaj przedzial okreslania wartosci funkcji:");
        System.out.println("Wieksze/mnijesze 0");
        System.out.println("Większe/mniejsze 1");
        System.out.println("Wieksze/mniejsze 2");
        int w = inputInt();
        System.out.println("Podaj x: ");
        int x = inputInt();
        zadanie2(x,w);

    }
    public static int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }
    public static void zadanie2 (int x, int w) {

        switch (w) {
            case 0:
                if (x > 0) {
                    x = 2 * x;
                    System.out.println("a(x)= " + x);
                } else if (x == 0) {
                    x = 0;
                    System.out.println("a(x)= " + x);
                } else if (x < 0) {
                    x = (-3) * x;
                    System.out.println("a(x)= " + x);
                }
                break;
            case 1:
                if (x >= 1) {
                    x = x * x;
                    System.out.println("b(x)= " + x);
                } else if (x < 1) {
                    x = x;
                    System.out.println("b(x)= " + x);
                }
                break;
            case 2:
                if (x > 2) {
                    x = 2 + x;
                    System.out.println("c(x)= " + x);
                } else if (x == 2) {
                    x = 8;
                    System.out.println("a(x)= " + x);
                } else if (x < 2) {
                    x = x - 4;
                    System.out.println("a(x)= " + x);
                }
                break;
            default:
                System.out.println("Niepoprawny wybor operacji.");
        }



    }
}