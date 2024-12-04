/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud3_ed;

/**
 * La clase CCuenta representa una cuenta bancaria.
 * Proporciona métodos para gestionar el nombre del titular, el número de cuenta,
 * el saldo y el tipo de interés asociado a la cuenta.
 * 
 * @author Ana
 */
public class CCuenta {

  // Atributos de la clase CCuenta
  protected String nombre;
  private String cuenta;
  private double saldo;
  private double tipoInterés;

  /**
   * Constructor vacío de la clase CCuenta.
   */
  public CCuenta() {
  }

  /**
   * Constructor con parámetros de la clase CCuenta.
   * 
   * @param nom  Nombre del titular de la cuenta.
   * @param cue  Número de cuenta.
   * @param sal  Saldo inicial de la cuenta.
   * @param tipo Tipo de interés de la cuenta.
   */
  public CCuenta(String nom, String cue, double sal, double tipo) {
    nombre = nom;
    cuenta = cue;
    saldo = sal;
    tipoInterés = tipo;
  }

  /**
   * Asigna un nombre al titular de la cuenta.
   * 
   * @param nom Nombre del titular.
   */
  public void asignarNombre(String nom) {
    nombre = nom;
  }

  /**
   * Obtiene el nombre del titular de la cuenta.
   * 
   * @return Nombre del titular.
   */
  public String obtenerNombre() {
    return nombre;
  }

  /**
   * Obtiene el estado actual de la cuenta, es decir, el saldo.
   * 
   * @return Saldo de la cuenta.
   */
  public double estado() {
    return saldo;
  }

  /**
   * Ingresa una cantidad en la cuenta.
   * 
   * @param cantidad Cantidad a ingresar.
   * @throws Exception Si la cantidad es negativa.
   */
  public void ingresar(double cantidad) throws Exception {
    if (cantidad < 0) {
      throw new Exception("No se puede ingresar una cantidad negativa");
    }
    setSaldo(saldo + cantidad);
  }

  /**
   * Retira una cantidad de la cuenta.
   * 
   * @param cantidad Cantidad a retirar.
   * @throws Exception Si la cantidad es negativa o si no hay suficiente saldo.
   */
  public void retirar(double cantidad) throws Exception {
    if (cantidad < 0) {
      throw new Exception("No se puede retirar una cantidad negativa");
    }
    if (estado() < cantidad) {
      throw new Exception("No hay suficiente saldo");
    }
    setSaldo(saldo - cantidad);
  }

  /**
   * Obtiene el número de cuenta.
   * 
   * @return Número de cuenta.
   */
  public String obtenerCuenta() {
    return cuenta;
  }

  /**
   * Asigna el número de cuenta.
   * 
   * @param cuenta Número de cuenta.
   */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  /**
   * Asigna el saldo de la cuenta.
   * 
   * @param saldo Saldo de la cuenta.
   */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  /**
   * Obtiene el tipo de interés de la cuenta.
   * 
   * @return Tipo de interés.
   */
  public double getTipoInterés() {
    return tipoInterés;
  }

  /**
   * Asigna el tipo de interés de la cuenta.
   * 
   * @param tipoInterés Tipo de interés.
   */
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
