package cuentas;
/**

 * Esta clase define el objeto CCuenta con sus correspondientes atributos y m�todos

 * @author: Carlos Fern�ndez Garc�a

 * @version: 1.0
 */
public class CCuenta {
	//Atributos de la clase
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    /**

     * Constructor para la clase CCuenta
     */
    public CCuenta() {
    }
    /**

     * Constructor de la clase CCuenta
     * @param nom El par�metro nom define el titular de la cuenta
	 * @param cue El par�metro cue define el n�mero de cuenta
	 * @param sal El par�metro saldo define el dinero que tiene la cuenta
	 * @param sal El par�metro tipo define el tipo de operacion que vas a realizar sobre la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }


    /**
     * Getter.
     * @return nombre: nombre del titular de la cuenta.
     */
	public String getNombre() {
		return nombre;
	}
	/**
     * Setter.
     * Asigna el nombre del titular de la cuenta al atributo nombre.
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	 /**
     * Getter.
     * @return cuenta: n�mero de la cuenta.
     */
	public String getCuenta() {
		return cuenta;
	}
	/**
     * Setter.
     * Asigna el n�mero de cuenta de la cuenta al atributo cuenta.
     */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**
     * Getter.
     * @return saldo: saldo de la cuenta.
     */
	public double getSaldo() {
		return saldo;
	}
	/**
     * Setter.
     * Asigna el saldo  de la cuenta al atributo saldo.
     */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
     * Getter.
     * @return tipoInteres: tipo de inter�s.
     */
	public double getTipoInteres() {
		return tipoInteres;
	}
	/**
     * Setter.
     * Asigna el tipo de interes al atributo tipoInteres.
     */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
	/**
     * Devuelve el saldo de la cuenta una vez ingresado el dinero ingresado y en el caso de intentar ingresar una cantidad negativa lanza una excepci�n.
     * @param cantidad dinero a ingresar en la cuenta.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");   
        }
        saldo = saldo + cantidad;
    }
    /**
     * Devuelve el saldo de la cuenta una vez retirado el dinero y en el caso de intentar retirar una cantidad negativa o una cantidad superior al saldo disponible de la cuenta lanza sus correspondientes excepci�nes.
     * @param cantidad dinero a retirar de la cuenta.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (getSaldo() < cantidad)
            throw new Exception("No hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
