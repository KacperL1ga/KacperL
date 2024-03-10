import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        System.out.println("Podaj y: ");
        int y = inputInt();
        zadanie5(y);

    }
    public static int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }
    public static int zadanie5(int y){
        y= (int) Math.pow(y,3);
        System.out.println("y = "+ y);
        return y;
    }
}
