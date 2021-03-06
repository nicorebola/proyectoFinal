/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.FinalizarPedido;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="detalle_pedido") 
public class detalle_pedido {
    
    @Id 
    @GeneratedValue(strategy=javax.persistence.GenerationType.AUTO)
    private long idDetalle;
    
    @Column(columnDefinition = "TEXT")
    private String nombre_producto;
    
    @Column(columnDefinition = "TEXT")
    private String nombre_menu;
    
    @Column(columnDefinition = "INT")
    private int cantidad;
    
    
    
//    @OneToMany (targetEntity = Mesa.class, cascade= CascadeType.ALL,fetch=FetchType.LAZY)
//    private Mesa mesa;

    
    public detalle_pedido() {
        
    }
    
    
    public long getId() {
        return idDetalle;
    }
    
    public String getNombre_menu() {
        return nombre_menu;
    }
    
     public String getNombre_producto() {
        return nombre_producto;
    }
     
    public int getCantidad() {
        return cantidad;
    }
    
    
    
//    public Mesa getMesa() {
//        return mesa;
//    }
    
    public void setIdDetalle(long idDetalle) {
        this.idDetalle = idDetalle;
    }
    
    public void setNombre_menu(String nombre_menu) {
        this.nombre_menu = nombre_menu;
    }
    
    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    @ManyToOne (targetEntity = Estado.class, cascade= CascadeType.ALL,fetch=FetchType.LAZY)
    private Estado estado; 
    
    public int getCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    public Estado getEstado() {
        return estado;
    }
    
//    public void notificado() {
//       this.setEstado(4);
//    }
//    public void finalizar() {
//       this.setEstado(3); //Ver el numero de estado al cual hace referencia el listo para entregar
//    }
        
    public detalle_pedido(long idDetalle, String nombre_producto, String nombre_menu, int cantidad, Estado estado) {
        this.idDetalle = idDetalle;
        this.nombre_producto = nombre_producto;
        this.nombre_menu = nombre_menu;
        this.cantidad = cantidad;
        //this.mesa = mesa;
        this.estado = estado;
    }
   

    
    
   }
