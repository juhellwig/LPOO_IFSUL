package model;

public class Peixe extends Animal{
    private double z=0.0;

    public Peixe() {
    }

    public Peixe(double x, double y) {
        super(x, y);
    }

    public Peixe(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public void mover(double x, double y, double z) {
        super.mover(x, y);
        this.z = z;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhou um peixe!");
    }

    @Override
    public String toString() {
        return "\nPeixe{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
