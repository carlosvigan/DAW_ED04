package cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Juan Lopez","1000-2365-85-1230456789", 2500, 0);
        operativa_cuenta(cuenta1, 1, 2300);
        operativa_cuenta(cuenta1, 2, 695);

    }

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