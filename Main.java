import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj a: ");
        int a = inputInt();
        //zadanie2(a,b);
        //zadanie3(a);
        //zadanie4(x);
        //zadanie5(y);
        //zadanie6(y);
        System.out.println("Podaj b: ");
        int b = inputInt();
        //zadanie2(a,b);
        boki(a,b);

    }
//koniec main

    public static void zadanie2(int a , int b){
        System.out.println("Suma "+ a+" + "+ b+ " = "+ (a+b));
        System.out.println("Rożnica "+ a+" - "+ b+ " = "+ (a-b));
        System.out.println("Iloczyn "+ a+" * "+ b+ " = "+ (a*b));
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
            System.out.println("Podałeś złą liczbę :( ");
        }
    }

    public static void zadanie4(int x){
        if (x%3 == 0 && x%5 == 0){
            System.out.printf("True");
        }
        else {
            System.out.printf("Zła liczba");
        };
    }


    public static int zadanie5(int y){
        int b=3;
        y= (int) Math.pow(y,b);
        System.out.println("y = "+ y);
        return y;
    }

    public static int zadanie6(int y){
        y= (int) Math.sqrt(y);
        System.out.println("y = "+ y);
        return y;
    }


    public static int losuj(int a, int b){
        Random random = new Random();
        int liczba = random.nextInt(b + a + 1)+a;
        return liczba;
    }
    public static void boki(int a, int b){
        int j=losuj(a,b);
        int k=losuj(a,b);
        int l=losuj(a,b);
        if (j*j + k*k == l*l || j*j == k*k + l*l || j*j + l*l == k*k){
            System.out.println("True");
        }
        else System.out.printf("Zła kombinacja liczb");
    }



}//koniec klasy