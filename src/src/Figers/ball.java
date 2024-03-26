package Figers;

public class ball {
    private double r;
    private String name = "Kula";

    public double getR() {
        return this.r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double pole(double r){return 4*Math.PI*r*r;}
    private double objetosc(double r){return (3/4)*Math.PI*Math.pow(r,3);}

    public void view(){
        System.out.format("Figura: %s, pole: %.2f, Obwod: BRAK, objetosc: %.2f\n",name,r,pole(r),objetosc(r));
    }

}
