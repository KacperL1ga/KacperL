package Figers;

public class cone {
    private double r;
    private double l;
    private double h;

    public double getH() {
        return this.h;
    }

    public void setH(double h) {
        this.h = h;
    }

    private String name = "Stozek";

    public double getR() {return r;}

    public void setR(double r) {
        this.r = r;
    }

    public double getL() {
        return this.l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double pole(double r,double l){return Math.PI*r*(r+l);}
    private double obwod(double r){return 2*Math.PI*r;}
    private double objetosc(double r,double h){return (1/3)*Math.PI*h*Math.pow(r,2);}

    public void view(){
        System.out.format("Figura: %s, bok r: %.2f, bok l: %.2f, bok h: %.2f, pole: %.2f, obwod: %.2f, objetosc: %.2f\n",name,r,l,h,pole(r,l),obwod(r),objetosc(r,h));
    }

}
