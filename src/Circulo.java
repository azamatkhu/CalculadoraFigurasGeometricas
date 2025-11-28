/**
 * La clase de la figura Circulo, que extiende de figura y implementa interfaz.
 * Circulo tiene variable radio, que sirve para calcularArea y calcularPerimetro.
 */
public class Circulo extends Figura implements Dibujable {
    private double radio;

    /**
     * El constructor de Circulo.
     */
    public Circulo(double radio) {
        this.radio = radio;
    }

    /**
     * Los getters y setters de Circulo.
     */
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * El metodo calcularArea adaptado para Circulo.
     * Calcula area de Circulo, aplicando una fórmula geométrica.
     */
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    /**
     * El metodo calcularPerimetro adaptado para Circulo.
     * Calcula perimertro de Circulo, aplicando una fórmula geométrica.
     */
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    /**
     * El metodo dibujar, que hace un print de Circulo en consola.
     */
    @Override
    public void dibujar() {
        System.out.println("    ****     ");
        System.out.println("  *      *   ");
        System.out.println(" *        * ");
        System.out.println(" *        * ");
        System.out.println("  *      *   ");
        System.out.println("    ****     ");
    }
}
