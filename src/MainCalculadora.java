/**
 *
 * @author Azamat Khudaiberdiev (azamat1x)
 */

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * La clase main, la principal clase para ejecutar el programa.
 * Nos permite crear figuras, calcular sus áreas y perimetros almacenandolas en un Array.
 */
public class MainCalculadora {
    /**
    * Array estático para almacenar las instancias de las figuras creadas.
    */
    public static Figura[] figurasArray = new Figura[99];

    /**
    * Contador estático que lleva el registro del número de figuras almacenado.
    */
    public static int contador = 0;
    /**
     * Un scanner para leer los datos entrantes del usuario.
     */
    public static Scanner sc = new Scanner(System.in);

    /**
     * El proceso main.
     * Muestra el menu donde el usuario controla el programa.
     */
    public static void main(String[] args) {
        int opcion = -1;

        /**
         * Un loop do-while sirve para crear el menu y para que
         * programa continúe después de diferentes resultados.
         */
        do {
            System.out.println("---------- Introduce una una de las figuras posibles: ");
            System.out.println("1. Circulo");
            System.out.println("2. Rectangulo");
            System.out.println("3. Triangulo");
            System.out.println("0. Mostrar Resumen");
            System.out.println("---------- Elige una opcion ---------- ");

            /**
             * Un try intenta ejecutar este bloque de codigo para que si sale un error
             * podremos captarlo.
             * Switch sirve para determinar que opcion ha elegido el usuario
             */
            try {
                opcion = sc.nextInt();
                sc.nextLine(); // Limpiamos el buffer del scanner.

                switch (opcion) {
                    case 1:
                        opcionCirculo();
                        break;
                    case 2:
                        opcionRectangulo();
                        break;
                    case 3:
                        opcionTriangulo();
                        break;
                    case 0:
                        System.out.println("Mostrar resumen");
                        break;
                    default:
                        System.out.println("Opcion no válida! Por favor, elige una opcion del 0 al 3.");
                }
            /**
             * Aqui capturamos el error InputMismatchException, que produce si el usuario
             * ha escrito algun simbolo que no sea de tipo int, o sea el numero.
             */
            } catch (InputMismatchException e) {
                System.out.println("Error: introduce un numero para la opcion!");
                sc.nextLine(); // Limpiamos el buffer del scanner.

                opcion = -1; // Mantener el bucle.
            }
        } while (opcion != 0);
        // Al opcion 0 mostramos el resumen del programa.
        mostrarResumen();
        sc.close();
    }

    /**
     * Permite al usuario crear un objeto de tipo Circulo.
     * Solicita el radio, valida la entrada y luego
     * almacena el círculo en un array si es possible.
     */
    public static void opcionCirculo(){
        boolean entradaEsValida = false;

        while (!entradaEsValida) {
            try {
                System.out.println("Introduce el radio: ");
                double radio = sc.nextDouble();

                /**
                 * Si el radio es un negativo, lanzamos un error personalizado.
                 */
                if (radio <= 0) {
                    throw new ArgumentoInvalido("El radio debe ser un valor positivo.");
                }

                /**
                 * Creamos el objeto Circulo y mostramos la información
                 * dibujando la figura por la consola.
                 */
                Circulo circulo = new Circulo(radio);
                System.out.println("Circulo se ha creado!");
                circulo.dibujar();
                System.out.printf("Su area es %.2f y perimetro es %.2f\n", circulo.calcularArea(), circulo.calcularPerimetro());

                /**
                 * Si en figurasArray hay espacio añademos la figura.
                 */
                if (figurasArray.length > contador) {
                    figurasArray[contador] = circulo;
                    contador++;
                } else {
                    System.out.println("No se ha podido añadir la figura al Array! Ha alcanzado el límite!");
                }

                entradaEsValida = true;
                /**
                 * Aquí capturamos los errores InputMismatchException y ArgumentoInvalido.
                 * Si alguno de ellos está capturado, hacemos un print con el error.
                 */
            } catch (InputMismatchException e) {
                System.out.println("Error: el radio debe ser un valor numérico.");
                sc.nextLine(); // Limpiar el buffer

            } catch (ArgumentoInvalido e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    /**
     * Permite al usuario crear un objeto Rectangulo.
     * Solicita la altura y el largo, válida que sean positivos y
     * almacena el rectángulo en un array si es possible.
     */
    public static void opcionRectangulo(){
        boolean entradaEsValida = false;

        while (!entradaEsValida) {
            try {
                System.out.println("Introduce la altura: ");
                double altura = sc.nextDouble();

                System.out.println("Introduce el largo: ");
                double largo = sc.nextDouble();

                /**
                 * Si altura o largo sea un negativo, lanzamos un error personalizado.
                 */
                if (altura <= 0 || largo <= 0) {
                    throw new ArgumentoInvalido("Largo y ancho deben ser valores positivos.");
                }

                /**
                 * Creamos el objeto Rectangulo y mostramos la información
                 * dibujando la figura por la consola.
                 */
                Rectangulo rectangulo = new Rectangulo(largo, altura);
                System.out.println("Rectangulo se ha creado!");
                rectangulo.dibujar();
                System.out.printf("Su area es %.2f y perimetro es %.2f\n", rectangulo.calcularArea(), rectangulo.calcularPerimetro());

                /**
                 * Si en figurasArray hay espacio añademos la figura.
                 */
                if (figurasArray.length > contador) {
                    figurasArray[contador] = rectangulo;
                    contador++;

                } else {
                    System.out.println("No se ha podido añadir la figura al Array! Ha alcanzado el límite!");
                }

                entradaEsValida = true;

            /**
             * Aquí capturamos los errores InputMismatchException y ArgumentoInvalido.
             * Si alguno de ellos está capturado, hacemos un print con el error.
             */
            } catch (InputMismatchException e) {
                System.out.println("Error: los valores deben ser un valor numérico.");
                sc.nextLine(); // Limpiar el buffer

            } catch (ArgumentoInvalido e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    /**
     * Permite al usuario crear un objeto Triangulo.
     * Solicita los tres lados, la base y la altura. Valida que todos sean positivos
     * y almacena el triangulo en un array si es possible.
     */
    public static void opcionTriangulo(){
        boolean entradaEsValida = false;

        while (!entradaEsValida) {
            try {
                System.out.println("Introduce el primer lado: ");
                double lado1 = sc.nextDouble();

                System.out.println("Introduce el segundo lado: ");
                double lado2 = sc.nextDouble();

                System.out.println("Introduce el tercer lado: ");
                double lado3 = sc.nextDouble();

                System.out.println("Introduce el base: ");
                double base = sc.nextDouble();

                System.out.println("Introduce la altura: ");
                double altura = sc.nextDouble();

                /**
                 * Si los lados, base o altura sean negativos, lanzamos un error personalizado.
                 */
                if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0 || base <= 0 || altura <= 0) {
                    throw new ArgumentoInvalido("Todos los lados deben ser valores positivos.");
                }

                /**
                 * Creamos el objeto Triangulo y mostramos la información
                 * dibujando la figura por la consola.
                 */
                Triangulo triangulo = new Triangulo(lado1, lado2, lado3, base, altura);
                System.out.println("Triangulo se ha creado!");
                triangulo.dibujar();
                System.out.printf("Su area es %.2f y perimetro es %.2f\n", triangulo.calcularArea(), triangulo.calcularPerimetro());

                /**
                 * Si en figurasArray hay espacio añademos la figura.
                 */
                if (figurasArray.length > contador) {
                    figurasArray[contador] = triangulo;
                    contador++;

                } else {
                    System.out.println("No se ha podido añadir la figura al Array! Ha alcanzado el límite!");
                }

                entradaEsValida = true;

            /**
             * Aquí capturamos los errores InputMismatchException y ArgumentoInvalido.
             * Si alguno de ellos está capturado, hacemos un print con el error.
             */
            } catch (InputMismatchException e) {
                System.out.println("Error: los valores deben ser un valor numérico.");
                sc.nextLine(); // Limpiar el buffer

            } catch (ArgumentoInvalido e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    /**
     * mostrarResumen muestra si el usuario ha creado las figuras o no.
     * Y si es verdad, las muestra.
     */
    public static void mostrarResumen(){
        System.out.println("-------------- RESUMEN ---------------");

        if (contador == 0) {
            System.out.println("No has creado ninguna figura durante el programa!");
            return;
        }

        System.out.println("Las figuras creadas: ");
        for (int i = 0; i < contador; i++) {
            System.out.println(figurasArray[i]);
        }
    }
}