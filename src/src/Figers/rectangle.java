package Figers;

public class rectangle {

    private double a;
    private double b;

    public double getA() {
        return this.a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return this.b;
    }

    public void setB(double b) {
        this.b = b;
    }
    private String name = "Prostokat";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private double pole(double a,double b){return a*b;};
    private double obwod(double a, double b){
        double i = (2 * a) + (2 * b);
        return i;};

    public void view(){
        System.out.format("Figura: %s, bok a: %.2f, bok b: %.2f, pole: %.2f, obwod: %.2f\n",name, a, b, pole(a,b), obwod(a,b));

    }




}
