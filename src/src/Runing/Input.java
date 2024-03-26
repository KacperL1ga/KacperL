package Runing;

import java.util.Scanner;

public class Input {
    Scanner input = new Scanner(System.in);

    public int inputInt() {
        return input.nextInt();
    }
    public double inputDouble() {
        return input.nextDouble();
    }

    public String inputChar() {
        System.out.println("Podaj t lub T:");
        String znak = input.next();
        return znak;
    }
}
