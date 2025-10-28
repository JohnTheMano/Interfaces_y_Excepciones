/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfases_y_excepciones;

/**
 *
 * @author Win
 */
public class Cliente implements Notificable{
    private String nombre; 

    public String getNombre() {
        return nombre;
    }

    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    @Override
    public void cambioDeEstado(String nuevoEstado){
        System.out.println("El cliente "+getNombre()+" cambio su estado a "+nuevoEstado);
     };

    @Override
    public String toString() {
        return getNombre();
    }
    
    
}
