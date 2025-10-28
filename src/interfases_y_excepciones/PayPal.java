/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfases_y_excepciones;

/**
 *
 * @author Win
 */
public class PayPal implements Pago {
    @Override
    public double procesarPago(double monto){
        System.out.println("Pago realizado con PayPal: $" + monto);
        return monto; // devuelve el monto cobrado
    }
    
    
    public double aplicarDescuento(double monto, double porcentaje){
        return monto - (monto*(porcentaje/100));}
    
}
