package cuentas;
/**

 * Esta clase contiene el método main y lanza las diferentes operativas que se desean realizar sobre la cuenta.

 * @author: Carlos Fernández García

 * @version: 1.0
 */
public class Main {
	/**
     * Metodo main: Primer método que se ejecuta al lanzar la aplicación. Desde aqui vamos a llamar al método encargado de realizar las difentes operativas
     * @param args Matriz de tipo String que recoge los valores que introduzcas a la hora de ejecutar tu aplicación.
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Juan Lopez","1000-2365-85-1230456789", 2500, 0);
        operativa_cuenta(cuenta1, 1, 2300);
        operativa_cuenta(cuenta1, 2, 695);

    }
	/**
     * Metodo operativa_cuenta: Metodo que nos permite realizar las operativas de retirar o ingresar dinero sobre la cuenta.
     * @param cuenta variable encargada de recibir el objeto instanciado de tipo CCuenta.
     * @param operacion variable que nos permite indicar el tipo de operación que vamos a realizar. 1 es retirar y 2 ingresar.
     * @param cantidad variable que recibe la cantidad de dinero a ingresar o retirar.
     */
	private static void operativa_cuenta(CCuenta cuenta, int operacion, float cantidad) {
		double saldoActual;
		saldoActual = cuenta.getSaldo();
        System.out.println("El saldo actual es " + saldoActual);
        if (operacion==1)
        {
	        try {
	            System.out.println("Cargo en cuenta");
	            cuenta.retirar(cantidad);
	            System.out.println("El nuevo saldo es: " + cuenta.getSaldo());
	        } catch (Exception e) {
	            System.out.print("Fallo al retirar");
	        }
		}
        if(operacion==2)
        {
	        try {
	            System.out.println("Abono en cuenta");
	            cuenta.ingresar(cantidad);
	            System.out.println("El nuevo saldo es: " + cuenta.getSaldo());
	        } catch (Exception e) {
	            System.out.print("Fallo al ingresar");
	        }
        }
	}

}