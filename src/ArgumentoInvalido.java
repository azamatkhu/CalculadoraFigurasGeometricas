/**
 * Una clase de excepcion, que nos sirve para lanzar una error cuando los argumentos son invalidos.
 */
public class ArgumentoInvalido extends RuntimeException {
    public ArgumentoInvalido(String message) {
        super(message);
    }
}
