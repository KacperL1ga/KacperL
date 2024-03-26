package Figers;

public class cuboid {
    private double a;
    private double b;
    private double c;
    private String name = "Prostopadloscian";

    public double getA() {return this.a;}

    public void setA(double a) {this.a = a;}

    public double getB() {return this.b;}

    public void setB(double b) {this.b = b;}

    public double getC() {return this.c;}

    public void setC(double c) {this.c = c;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    private double pole(double a,double b, double c){return 2*(a*b+b*c+a*c);}
    private double obwod(double a,double b,double c){return 4*(a+b+c);}
    private double objetosc(double a, double b, double c){return a*b*c;}

    public void view(){
        System.out.format("Figura: %s, bok a: %.2f, bok b: %.2f, bok c: %.2f, pole: %.2f, obwod: %.2f, objetosc: %.2f\n", name,a,b,c,pole(a,b,c),obwod(a,b,c),objetosc(a,b,c));
    }


}
