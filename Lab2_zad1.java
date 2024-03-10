import java.util.Scanner;
    public class Lab2_zad1 {
        public static void main(String[] args) {
            System.out.println("Podaj a: ");
            int a = inputInt();
            System.out.println("Podaj b: ");
            int b =inputInt();
            System.out.println("Podaj c: ");
            int c =inputInt();
            zadanie1(a,b,c);
        }
        public static int inputInt(){
            Scanner scanner = new Scanner(System.in);
            int liczba = scanner.nextInt();
            return liczba;
        }
        public static void zadanie1(int a, int b, int c) {
            int delta = b * b - 4 * a * c;

            if (delta > 0) {
                double pierwiastekDelta = Math.sqrt(delta);
                double x1 = (-b + pierwiastekDelta) / (2 * a);
                double x2 = (-b - pierwiastekDelta) / (2 * a);
                System.out.println("Rownanie "+a+"x2+"+b+"x+"+c+"ma dwa pierwiastki rzeczywiste: x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x0 = -b / (2 * a);
                System.out.println("Rownanie "+a+"x2+"+b+"x+"+c+" ma jeden pierwiastek rzeczywisty: x0 = " + x0);
            } else {
                System.out.println("Rownanie "+a+"x2+"+b+"x+"+c+"nie ma pierwiastkow rzeczywistych");
            }
        }


    }


