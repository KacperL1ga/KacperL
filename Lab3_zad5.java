import java.util.Scanner;
public class Lab3_zad5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj słowo: ");
            String slowo = scanner.nextLine();

            boolean isPalindrome = true;

            // Pętla sprawdzająca czy słowo jest palindromem
            for (int i = 0; i < slowo.length() / 2; i++) {
                if (slowo.charAt(i) != slowo.charAt(slowo.length() - i - 1)) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println("Podane słowo \"" + slowo + "\" jest palindromem.");
            } else {
                System.out.println("Podane słowo \"" + slowo + "\" nie jest palindromem.");
            }

            scanner.close();
        }
    }
