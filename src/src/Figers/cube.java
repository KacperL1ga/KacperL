package Figers;

public class cube {

    private double a;
    private String name = "Szescian";

    public double getA() {return this.a;}

    public void setA(double a) {this.a = a;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    private double pole(double a){return 6*a*a;}
    private double obwod(double a){return 12*a;}
    private double objetosc(double a){return a*a*a;}

    public void view(){
        System.out.format("Figura: %s, bok: %.2f, pole: %.2f, obwod: %.2f, objetosc: %.2f\n",name,a,pole(a),obwod(a),objetosc(a));
    }
}

