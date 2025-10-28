/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfases_y_excepciones;

import java.util.ArrayList;

/**
 *
 * @author Win
 */
public class Pedido implements Pagable{
    private ArrayList<Producto> listaProductos = new ArrayList(); 
    private String estado;
    private Cliente cliente;

    public Pedido(String estado, Cliente cliente) {
        this.estado = estado;
        this.cliente = cliente;
    }
    
       
     public double calcularTotal(){
         double sumaTotal = 0;
         for(Producto p:listaProductos){
             sumaTotal+= p.getPrecio();
         }
         return sumaTotal;
     }

    public Pedido(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
     public void cambioDeEstado(String nuevoEstado){
         this.estado = nuevoEstado;
         cliente.cambioDeEstado(nuevoEstado);
    } 
    public void agregarPedido(Producto prod){
        listaProductos.add(prod);
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public String getEstado() {
        return estado;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
