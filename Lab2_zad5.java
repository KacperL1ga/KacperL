
import java.util.Scanner;

public class Lab2_zad5 {

    public static int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }
    public static void main(String[] args) {
        System.out.println("Czy dostałeś premie?");
        System.out.println("Wybierz: 1-Tak  0-Nie");
        int premia = inputInt();
        System.out.println("Czy posiadasz zniżke?");
        System.out.println("Wybierz: 1-Tak  0-Nie");
        int znizka = inputInt();
        zadanie5(znizka,premia);
    }

    public static void zadanie5 (int znizka, int premia){
        if (premia == 1 && znizka == 0){
            System.out.println("Możesz kupic samochod.");
            System.out.println("Zniżki na samochod nie ma");
        } else if (znizka == 0 || premia == 0) {
            System.out.println("Zakup samochodu trzeba odłożyć na później...");
            System.out.println("Zniżki na samochód nie ma");
        }
        else if (znizka == 1 || premia == 1){
            System.out.println("Możesz kupić samochód");
        }
    }


}
