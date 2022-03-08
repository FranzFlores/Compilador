/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backup;

/**
 *
 * @author 
 */
public enum Types {
    SUMA("^([+])$"), 
    RESTA("^([-])$"), 
    MULTIPLICACION("^([*])$"), 
    ASIGNACION("^([=][>])$"),
    IGUALDAD("^[=]$"),
    SEPARADOR("^[;]$"),
    ENTERO_POSITIVO("^([+])?([1-9])*?$"), 
    ENTERO_NEGATIVO("^([-])([1-9])*$"),
    DECIMAL_POSITIVO("^([+])?([1-9]+[.]+[0-9]{1,2})*$"),
    DECIMAL_NEGATIVO("^([-])([1-9]+[.]+[0-9]{1,2})*$"),
    VARIABLEX("^([x])$"),
    VARIABLEY("^([y])$"),
    ECUACION("^([EC])+([1-2])$"),
    PALABRA_RESERVADA("solucionar");
  
    public final String pattern;

    private Types(String pattern) {
        this.pattern = pattern;
    }
}
