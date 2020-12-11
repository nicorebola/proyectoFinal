package Modelos.FinalizarPedido;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table (name="estado") 
public class Estado {
    @Id @GeneratedValue(strategy=javax.persistence.GenerationType.AUTO) 
    private long idEstado;
    
    @Column(columnDefinition = "TEXT")
    private String nombre;
  
    public long getIdEstado() {
        return idEstado;
    }
    
    public String getDescripcion() {
        return nombre;
    }
    
     public void setIdEstado(long idEstado) {
        this.idEstado = idEstado;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estado(long idEstado, String nombre) {
        this.idEstado = idEstado;
        this.nombre = nombre;
    }
    
    
}
