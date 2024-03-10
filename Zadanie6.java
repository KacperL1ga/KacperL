import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        System.out.println("Podaj y: ");
        int y = inputInt();
        zadanie6(y);

    }
    public static int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }
    public static int zadanie6(int y){
        y= (int) Math.sqrt(y);
        System.out.println("y = "+ y);
        return y;
    }
}
