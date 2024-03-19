import java.util.Random;
import java.util.Scanner;

public class Lab3_zad1 {

    public static int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }

    public static void PktStudenta(int n){
        int x = 1;
        int suma = 0;
        while(x<=n){
            System.out.println("Podaj liczbę punktów studenta nr."+x+" :");
            int y=inputInt();
            suma = y + suma;
            x=x+1;
        }
        double srednia =suma/n;
        System.out.println("Srednia pkt studentow rowna się: "+srednia);
    }

    public static void main(String[] args) {
        System.out.println("Podaj liczbę studentów: ");
        int n = inputInt();
        PktStudenta(n);

    }


}
