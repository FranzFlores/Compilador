/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package errors;

/**
 *
 * @author andre
 */
public class NegativeNumberException extends Exception {

    /**
     * Creates a new instance of <code>NegativeNumber</code> without detail
     * message.
     */
    public NegativeNumberException() {
    }

    /**
     * Constructs an instance of <code>NegativeNumber</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public NegativeNumberException(String msg) {
        super(msg);
    }
}
