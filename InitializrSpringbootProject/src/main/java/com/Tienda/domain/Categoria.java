package com.Tienda.domain;

import javax.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author heaa1
 */
@Data // ayuda a crear de manera automatica los Get y Set
@Entity
@Table(name = "categoria")
public class Categoria implements Serializable {

    private static final long serialVersonUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoria;
    private String descripcion;
    private boolean activo;

    public Categoria(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }

    public Categoria() {
    }
    
    
    
    
    


    
    
}
