
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
@Table (name="mesa") 
public class Mesa {
    
    @Id 
    @GeneratedValue(strategy=javax.persistence.GenerationType.AUTO)
    private long idMesa;
    
    @Column(columnDefinition = "TEXT")
    private String descripcion;
  
    public long getIdMesa() {
        return idMesa;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public detalle_pedido getDetalle() {
        return detalle;
    }
    
   
    @ManyToOne (targetEntity = detalle_pedido.class, cascade= CascadeType.ALL,fetch=FetchType.LAZY)
    private detalle_pedido detalle;
    
     public void setIdMesa(long idMesa) {
        this.idMesa = idMesa;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
     
    public void setDetalle(detalle_pedido detalle) {
        this.detalle = detalle;
    }

    public Mesa(long idMesa, String descripcion, detalle_pedido detalle) {
        this.idMesa = idMesa;
        this.descripcion = descripcion;
        this.detalle = detalle;
        
    }
    
    
    
    
}
