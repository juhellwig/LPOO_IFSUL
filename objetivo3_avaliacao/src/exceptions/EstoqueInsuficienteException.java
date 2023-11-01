package exceptions;

import controller.VendasController;

public class EstoqueInsuficienteException extends Exception {
    public EstoqueInsuficienteException(String msg) {
        super(msg);
    }
}
