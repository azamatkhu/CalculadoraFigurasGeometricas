/**
 * La clase de la figura Triangulo, que extiende de figura y implementa interfaz.
 * Tiene los variables ladoA, ladoB, ladoC, base y altura que sirven para calcularArea y calcularPerimetro.
 */
public class Triangulo extends Figura implements Dibujable{
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double base;
    private double altura;

    /**
     * El constructor de Triangulo.
     */
    public Triangulo(double ladoA, double ladoB, double ladoC, double base, double altura) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.base = base;
        this.altura = altura;
    }

    /**
     * Los getters y setters de Triangulo.
     */
    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * El metodo calcularArea adaptado para Triangulo.
     * Calcula area de Triangulo, aplicando una fórmula geométrica.
     */
    @Override
    public double calcularArea() {
        return base *  altura / 2;
    }

    /**
     * El metodo calcularPerimetro adaptado para Triangulo.
     * Calcula perimertro de Triangulo, aplicando una fórmula geométrica.
     */
    @Override
    public double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }

    /**
     * El metodo dibujar, que hace un print de Triangulo en consola.
     * Aquí he utilizado doble \\ porque me daba un error que utilizo los simbolos illegales ¯\_(ツ)_/¯.
     */
    @Override
    public void dibujar() {
        System.out.println("   /\\  ");
        System.out.println("   / \\  ");
        System.out.println("  /   \\ ");
        System.out.println(" /     \\  ");
        System.out.println("/_______\\  ");
    }

}
