/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Prueba nuevo commit

package cuentas;

import cuentas.CCuenta;
/**CLASE PRINCIPAL DEL PROGRAMA*/
public class Main {
/** EJERCICIO 10 ED. INSERTAR COMENTARIOS JAVADOC */
/**CLASE MAIN CONTENDRÁ EL METODO PRINCIPAL Y EL METODO OPERATIVA CUENTA QUE UTILIZARÁ EL MAIN*/
    public static void main(String[] args) {
        operativa_cuenta(0);
    }
/**METODO OPERATIVA CUENTA, PRUEBA DE LOS METODOS RETIRAR E INGRESAR CON TRATAMIENTO DE EXCEPCIONES.*/
    public static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

}
