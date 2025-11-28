/**
 * La clase de la figura Rectangulo, que extiende de figura y implementa interfaz.
 * Tiene los variables largo (ancho) y altura que sirven para calcularArea y calcularPerimetro.
 */
public class Rectangulo extends Figura implements Dibujable{
    private double largo;
    private double altura;

    /**
     * El constructor de Rectangulo.
     */
    public Rectangulo(double largo, double altura)
    {
        this.largo = largo;
        this.altura = altura;
    }

    /**
     * Los getters y setters de Rectangulo.
     */
    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * El metodo calcularArea adaptado para Rectangulo.
     * Calcula area de Rectangulo, aplicando una fórmula geométrica.
     */
    @Override
    public double calcularArea() {
        return largo * altura;
    }

    /**
     * El metodo calcularPerimetro adaptado para Rectangulo.
     * Calcula perimertro de Rectangulo, aplicando una fórmula geométrica.
     */
    @Override
    public double calcularPerimetro() {
        return (largo + altura) * 2;
    }
    /**
     * El metodo dibujar, que hace un print de Rectangulo en consola.
     */
    @Override
    public void dibujar() {
        System.out.println("=-----------=");
        System.out.println("|           |");
        System.out.println("|           |");
        System.out.println("|           |");
        System.out.println("=-----------=");
    }
}
