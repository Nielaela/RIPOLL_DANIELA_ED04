/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cuentas;

/** CLASE CCUENTA, SE UTILIZARÁ PARA CREAR INSTANCIAS QUE TENGAN COMO ATRIBUTOS EL NOMBRE, LA CUENTA, EL SALDO Y EL TIPO DE INTERES*/
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
//EJERCICIO 4 REFACTOR.
// LOS ATRIBUTOS YA ESTABAN CON SUS MODIFICADORES PRIVADOS, HE AÑADIDO LOS METODOS GET/SET QUE FALTABAN,(CUENTA Y SALDO)
//IGUALMENTE PARA ENCAPSULAR SE REFACTORIZA Y SE ELIGE LA OPCIÓN DE ENCAPSULATE FIELDS. Desde ahi ya seleccionarias como quieres los atirbutos y sus geters y seters. 
//Indicando como private el modificador del atributo y como public el de los geter y seters.
    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    public String obtenerNombre()
    {
        return getNombre();
    }


    public double estado()
    {
        return getSaldo();
    }

/** METODO INGRESAR EN EL QUE SE CREA LA CONDICIÓN PARA DAR AVISO CON UN PRINT SI SE INGRESA UN VALOR INFERIOR A 0*/
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/** METODO RETIRAR IGUAL QUE EL ANTERIOR, PARA CONTROLAR LA ENTRADA ERRONEA DE DATOS, SI LA CANTIDAD ES INFERIOR A 0 O SI EL SALDO ES INFERIOR A LA CANTIDAD SOLICITADA*/
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }


    public String obtenerCuenta()
    {
        return getCuenta();
    }

/**GETTERS Y SETTERS*/
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getTipoInterés() {
        return tipoInterés;
    }


    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
