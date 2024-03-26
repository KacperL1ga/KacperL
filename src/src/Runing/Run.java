package Runing;

import Figers.*;

public class Run {
    /*
    * w klasie input beda zdefiniowane metody
    * input string int double inne */
    Input input = new Input();
    public void runing() {
        int wybor;
        while (true){
            Menu(); // menu programu
            wybor = input.inputInt(); // metoda do wczytania int
            switch (wybor){
                case 1 ->viewCircle();
                case 2 ->viewSquare();
                case 3 ->viewRectangle();
                case 4 ->viewCube();
                case 5 ->viewBall();
                case 6 ->viewCone();
                case 7 ->viewCuboid();
                case 8 ->Close();
                default -> defaultInstructioon();
            }//koniec switch
        }//koneic while
    }// koniec run

    private void defaultInstructioon() {
        System.out.println("Bledne dane, koniec programu");
        System.exit(0);
    }

    private void Close() {
        System.out.println("Czy na pewno chcesz wyjść? t || T");
        String znak = input.inputChar();
        String str1 = "t", str2 = "T";
        if (znak.equals(str1) || znak.equals(str2)) System.exit(0);
    }

    private void viewCircle() {
        //utworzenie obiektu danej klasy
        /*
        * podanie nazy figury
        * podanie niezbędnych wartości
        * sprwadzenie czy podano poprana wartosc if lub abs
        * wywolanie metody view()*/
        Circle kolo = new Circle();
        while (true){
            System.out.print("Podaj promień koła:");
            double r=Math.abs(input.inputDouble());
            if (r != 0){
                kolo.setR(r);
                break;
            }
            else {
                System.out.println("Podaj wartość różną od zera");
            }
        }
        kolo.view();
    }
    private void viewBall(){
        ball kula = new ball();
        while (true){
            System.out.print("Podaj promień kuli:");
            double r=Math.abs(input.inputDouble());
            if (r != 0){
                kula.setR(r);
                break;
            }
            else {
                System.out.println("Podaj wartość różną od zera");
            }
        }
        kula.view();
    }
    private void viewCone(){
        cone stozek = new cone();
        while (true){
            System.out.print("Podaj promień stożka:");
            double r =Math.abs(input.inputDouble());
            System.out.print("Podaj dlugosc krawedzi stożka:");
            double l =Math.abs(input.inputDouble());
            System.out.print("Podaj wysokosc stożka:");
            double h =Math.abs(input.inputDouble());

            if(r != 0 && l != 0 && h != 0){
                stozek.setR(r);
                stozek.setH(h);
                stozek.setL(l);
                break;
            }
            else {
                System.out.println("Jedna lub więcej wartości jest równa zero, Popraw!!");
            }
        }
        stozek.view();
    }
    private void viewCube(){
        cube szescian = new cube();
        while (true){
            System.out.print("Podaj wartosc boku szescianu:");
            double a =Math.abs(input.inputDouble());
            if (a != 0){
                szescian.setA(a);
                break;
            }
            else {
                System.out.println("Podaj wartość rózną od zera.");
            }
        }
        szescian.view();
    }
    private void viewCuboid(){
        cuboid prostopadloscian =new cuboid();
        while (true){
            System.out.print("Podaj wartosc boku a: ");
            double a = Math.abs(input.inputDouble());
            System.out.print("Podaj wartosc boku b: ");
            double b = Math.abs(input.inputDouble());
            System.out.print("Podaj wartosc boku c: ");
            double c = Math.abs(input.inputDouble());
            if (a != 0 && b != 0 && c != 0) {
                prostopadloscian.setA(a);
                prostopadloscian.setB(b);
                prostopadloscian.setC(c);
                break;
            }
            else {
                System.out.println("Jedna lub więcej wartości jest równa zero, Popraw!!");
            }
        }
        prostopadloscian.view();
    }

    private void viewRectangle(){
        rectangle prostokat =new rectangle();
        while (true){
            System.out.print("Podaj wartosc boku a:");
            double a = Math.abs(input.inputDouble());
            System.out.print("Podaj wartosc boku b: ");
            double b = Math.abs(input.inputDouble());
            if(a != 0 && b != 0){
                prostokat.setA(a);
                prostokat.setB(b);
                break;
            }
            else {
                System.out.println("Jedna lub więcej wartości jest równa zero, Popraw!!");
            }
        }
        prostokat.view();
    }
    private void viewSquare(){
        square kwadrat =new square();
        while (true){
            System.out.print("Podaj wartosc boku a:");
            double a =Math.abs(input.inputDouble());
            if (a != 0){
                kwadrat.setA(a);
                break;
            }
            else {
                System.out.println("Podaj wartość rózną od zera.");
            }
        }
        kwadrat.view();
    }


    private void Menu() {
        System.out.println("Kalkulator figur geometrycznyhc");
        System.out.println("1. Kolo\n"+
                "2. Kwadrat\n"+
                "3. Prostokat\n"+
                "4. Szescian\n"+
                "5. Kula\n"+
                "6. Stozek\n"+
                "7. Prostopadloscian\n"+
                "8. Wyjscie");
        System.out.print("\n\nWybierz opcje: ");
    }

}//koniec klasy
