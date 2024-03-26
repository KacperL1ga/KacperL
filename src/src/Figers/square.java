package Figers;

public class square {
    private double a;
    private String name = "Kwadrat";

    public double getA() {
        return this.a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double pole(double a){
        return a*a;};
    private double obwod(double a){
        return 4*a;};
    public void view(){
        System.out.format("Figura: %s, bok: %.2f, pole: %.2f, obwód: %.2f\n",
                name, a, pole(a), obwod(a));
    }
}
