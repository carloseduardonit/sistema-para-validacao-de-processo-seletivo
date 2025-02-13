
package DesafioControleFluxo;

/**
 *
 * @author Carlos Eduardo dos Santos Figueiredo
 * @link https://www.linkedin.com/in/carlos-eduardo-dos-s-figueiredo/
 * @link https://github.com/carloseduardonit
 */
public class ParametrosInvalidosException extends Exception{

    /**
     * Creates a new instance of <code>ParametrosInvalidosException</code>
     * without detail message.
     */
    public ParametrosInvalidosException() {
    }

    /**
     * Constructs an instance of <code>ParametrosInvalidosException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public ParametrosInvalidosException(String msg) {
        super(msg);
    }
}
