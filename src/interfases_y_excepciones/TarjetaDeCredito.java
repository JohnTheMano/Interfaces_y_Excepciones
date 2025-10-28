/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfases_y_excepciones;

/**
 *
 * @author Win
 */
public class TarjetaDeCredito implements PagoConDescuento{
    
    @Override
    public double aplicarDescuento(double monto, double porcentajeDescuento){
        return monto - (monto * porcentajeDescuento);
    }
    
    @Override
    public double procesarPago(double monto){
        System.out.println("");
        return monto;}
    };

